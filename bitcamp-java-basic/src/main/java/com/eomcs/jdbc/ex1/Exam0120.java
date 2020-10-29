package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0120 {
  public static void main(String[] args) {

    // JDBC 드라이버 로딩 방법2: Driver 구현 객체 생성과 자동 등록
    // => Driver 객체를 생성하면 자동으로 DriverManager에 등록된다.
    // => 어떻게?
    // Driver 구현체가 로딩될 때 static 블록에서 인스턴스를 만들어 등록하기 때문이다.

    try {
      // 1) Driver 구현체의 인스턴스 생성
      // => Driver 구현체가 로딩될 때 인스턴스가 생성되기 때문에
      // 굳이 다음과 같이 인스턴스를 생성할 필요가 없다.

      new org.mariadb.jdbc.Driver();
      new oracle.jdbc.driver.OracleDriver();
      new com.microsoft.sqlserver.jdbc.SQLServerDriver();

      // 2) DriverManager에 등록 안함!
      // DriverManager에 자동으로 등록됐는지 확인해보자!

      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);

      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver2);

      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver3);

      // 해당 드라이버가 등록되지 않았으면 예외가 발생할 것이다.


    } catch (Exception e) {
      e.printStackTrace();
    }
  }


// 실행하면 static 블록이 먼저 실행되고, 자동으로 드라이브 매니저를 등록한다.
// 다운 받은 API 클래스 안에 있는 코드
//  static {
//    try {
//      DriverManager.registerDriver(new Driver(), new DeRegister());
//    } catch (SQLException e) {
//      throw new RuntimeException("Could not register driver", e);
//    }
//  }

}
