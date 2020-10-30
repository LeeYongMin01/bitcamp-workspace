package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberListCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[회원 목록]");

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/user1db?user=user1&password=1111");

     PreparedStatement stmt = con.prepareStatement(
         "select no, name, email, photo, tel, cdt"
         + " from pms_member "
         + " order by no desc");

      ResultSet rs = stmt.executeQuery()) {

    while (rs.next()) {
      System.out.printf("%d, %s, %s, %s, %s, %s\n",
          rs.getInt("no"),
          rs.getString("name"),
          rs.getString("email"),
          rs.getString("photo"),
          rs.getString("tel"),
          rs.getDate("cdt"));
    }
  } catch(Exception e) {
    System.out.println("멤버 목록 조회 중 오류 발생!");
    e.printStackTrace();
  }

  }

}
