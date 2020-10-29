// 게시물 관리 - 목록
package com.eomcs.jdbc.ex2;

import java.sql.DriverManager;

public class Exam0120 {
  public static void main(String[] args) throws Exception {


    try (java.sql.Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/user1db?user=user1&password=1111");

        java.sql.Statement stmt = con.createStatement();

        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board order by board_id desc");

        ) {

      System.out.println("번호, 제목, 등록일, 조회수");

      while (rs.next()) {
        // 레코드에서 컬럼 값을 꺼낼 때 컬럼 번호를 지정하는 것 보다
        // 컬럼의 이름을 지정하는 것이 유지보수에 더 좋다.
        System.out.printf("%d, %s, %s, %d\n",
            rs.getInt("board_id"),
            rs.getString("title"),
            rs.getDate("created_date"),
            rs.getInt("view_count"));

      }
    }
  }
}