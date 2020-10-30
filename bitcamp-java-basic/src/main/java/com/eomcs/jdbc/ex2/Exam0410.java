// 게시판 관리 - 등록
package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0410 {
  public static void main(String[] args) throws Exception {
    String title = null;
    String contents = null;
    ArrayList<String> files = new ArrayList<>();


    try (Scanner keyScan = new Scanner(System.in)){

      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

      // 사용자로부터 첨부파일 입력 받기
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

        // 게시글 입력 처리 객체
        PreparedStatement boardStmt = con.prepareStatement(
            "insert into x_board(title,contents) values(?,?)");

        // 첨부파일 입력 처리 객체
        PreparedStatement fileStmt = con.prepareStatement(
            "insert into x_board_file(file_path,board_id) values(?,?)")) {

      // 게시글 SQL에 값 설정
      boardStmt.setString(1, title);
      boardStmt.setString(2, contents);

    int count = boardStmt.executeUpdate();
    System.out.printf("%d 개 게시글 입력 성공!", count);

    // 첨부파일 입력
    int fileCount = 0;
    for(String filename : files) {

    fileStmt.setString(1, filename);
    fileStmt.setInt(2, 0);
    // 첨부파일 테이블에 데이터를 입력하려면,
    // 게시글 테이블의 게시글 번호를 알아야 하는데
    // 바로 위에서 입력한 게시글의 PK가 자동으로 생성되는 컬럼이기 때문에
    // 입력한 후 그 PK값이 뭔지 알 수가 없다는 것이다.
    // 그래서 첨부파일 테이블에 데이터를 입력할 수 없다.
    // 해결방법
    // => 데이터를 입력할 때 자동 생성되는 PK 값을 알 수 있다면 문제 해결 가능
    // 다음 예제 확인

    fileStmt.executeUpdate();
    fileCount++;

    }
    System.out.printf("%d 개 첨부파일 입력 성공!", fileCount);
    }
  }
}
