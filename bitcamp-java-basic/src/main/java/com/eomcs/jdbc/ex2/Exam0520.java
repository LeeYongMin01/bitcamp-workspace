package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0520 {
  public static void main(String[] args) {
    String title = null;
    String contents = null;
    ArrayList<String> files = new ArrayList<>();


    try (Scanner keyScan = new Scanner(System.in)){

      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

      while (true) {
        System.out.print("첨부파일: (완료는 엔터) ");
        String filename = keyScan.nextLine();
        if(filename.length() == 0) {
          break;
        }
        files.add(filename);
      }
      }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/user1db?user=user1&password=1111");

        PreparedStatement boardStmt = con.prepareStatement(
            "insert into x_board(title,contents) values(?,?)",
            Statement.RETURN_GENERATED_KEYS);

        PreparedStatement fileStmt = con.prepareStatement(
            "insert into x_board_file(file_path,board_id) values(?,?)")) {

      // 한 단위로 수행해야 하는 작업이 있다면,
      // commit 할 때까지 실제 테이블에 적용하지 않도록
      // auto commit을 취소하고 수동 커밋 상태로 만든다.
      con.setAutoCommit(false);

      boardStmt.setString(1, title);
      boardStmt.setString(2, contents);

      int count = boardStmt.executeUpdate();
      System.out.printf("%d 개 게시글 입력 성공!\n", count);

      ResultSet keyRS = boardStmt.getGeneratedKeys();
      keyRS.next();
      int boardId = keyRS.getInt(1);


    int fileCount = 0;
    for(String filename : files) {

    fileStmt.setString(1, filename);


    fileStmt.setInt(2, boardId);

    fileStmt.executeUpdate();
    fileCount++;

    }
    System.out.printf("%d 개 첨부파일 입력 성공!\n", fileCount);

    // 자식 테이블의 데이터까지 정상적으로 입력했다면,
    // DBMS에게 작업 결과를 실제 테이블에 적용하라고 요청한다.
    con.commit();

    } catch (Exception e) {
      System.out.println("게시글 입력 중 오류 발생!");

      // 만약에 입력 도중에 실패했다면,
      // 현재까지 작업한 결과를 모두 취소하라고 DBMS에게 통보한다.
      // => commit()을 호출하지 않고 커넥션 객체를 닫으면,
      // DBMS는 그 커넥션을 통해 수행한 모든 작업을 rollback 한다.
      // => 따라서, 따로 커넥션 객체에 대해 rollback()을 호출할 필요가 없다.

    }
  }
}
