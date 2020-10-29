// JDBC 프로그래밍 - DBMS에 SQL문 보내기 : select
package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0341 {
  public static void main(String[] args) throws Exception {


    try (java.sql.Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/user1db?user=user1&password=1111");

        java.sql.Statement stmt = con.createStatement();

        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board order by board_id desc");

        ) {


      while (rs.next()) {
        // 컬럼의 타입에 상관없이 getString()으로 값을 꺼낼 수 있다.
        System.out.printf("%d, %s, %s, %s, %d\n",
            rs.getString("board_id"),
            rs.getString("title"),
            rs.getString("contents"),
            rs.getString("created_date"),
            rs.getString("view_count"));

      }
    }
  }
}