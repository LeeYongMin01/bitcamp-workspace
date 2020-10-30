package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0220 {
  public static void main(String[] args) throws Exception {
    String no = null;
    String title = null;
    String contents = null;

    try (Scanner keyScan = new Scanner(System.in)) {

      System.out.print("번호? ");
      no = keyScan.nextLine();

      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/user1db?user=user1&password=1111");

        // PreparedStatement는 미리 SQL 문장을 준비하여 값을 삽입하는 기법이다.
        PreparedStatement stmt = con.prepareStatement(
            "update x_board set title = ?, contents = ? where board_id = ?")) {


      // SQL 문장을 준비할 때, 값이 들어 갈 자리에 ? 로 표시한다.
      // ? 를 "in-parameter"라 부른다.

      // SQL을 서버에 전달하기 전에 in-parameter 자리에 값을 넣는다.
      // => PreparedStatement.setXxx(in-parameter 인덱스, 값);
      // - setXxx : 컬럼의 타입에 따라 setInt(), setString(), setDate() 등을 사용한다.
      // - in-parameter 인덱스
      //    - ? 문자가 등장하는 순서대로 1부터 번호를 부여한다.
      // - 값
      //    - SQL 문장에 삽입될 값이다. 실제 SQL 문장과 별도로 서버에 전달되기 때문에
      //    문자열 값 중간에 '(작은 따옴표)가 포함되더라도 SQL 문에 영향을 끼치지 않는다.
      //    작은 따옴표를 그냥 일반 문자로 취급한다.
      //    즉, SQL 삽입 공격이 불가능하다.
      // => in-parameter 값을 설정할 때 순서대로 할 필요는 없다.
      stmt.setString(1, title); // int 컬럼의 값을 setString() 으로 설정할 수 있다.
      stmt.setString(2, contents);
      stmt.setString(3, no);

      // PreparedStatement 에서는 SQL 문을 서버에 보내기 위해
      // executeUpdate()를 호출할 때 파라미터로 전달하지 않는다.
      // 이미 객체를 생성할 때 SQL문을 준비했기 때문이다.
    int count = stmt.executeUpdate();

    if(count == 0) {
      System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
    } else {
    System.out.println("변경 완료!");
    }
    }
  }
}
