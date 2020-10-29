// 게시물 관리 - 조회
package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exam0130 {
  public static void main(String[] args) throws Exception {
    int no = 0;
    try (Scanner keyScan = new Scanner(System.in)){

      System.out.print("번호? ");
      no = Integer.parseInt(keyScan.nextLine());

    }

    try (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/user1db?user=user1&password=1111");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(
            "select * from x_board where board_id =" + no)) {

      if (rs.next()) {
        // 레코드에서 컬럼 값을 꺼낼 때 컬럼 번호를 지정하는 것 보다
        // 컬럼의 이름을 지정하는 것이 유지보수에 더 좋다.
        System.out.printf("제목: %s\n", rs.getString("title"));
        System.out.printf("내용: %s\n", rs.getString("contents"));
        System.out.printf("등록일: %s\n", rs.getDate("created_date"));
        System.out.printf("조회수: %s\n", rs.getInt("view_count"));

      } else {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      }
    }
  }
}