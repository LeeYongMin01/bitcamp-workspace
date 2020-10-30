package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class MemberUpdateCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[회원 변경]");
    int no = Prompt.inputInt("번호? ");

    String email = null;
    String photo = null;
    String tel = null;

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/user1db?user=user1&password=1111");

      PreparedStatement stmt = con.prepareStatement(
          "select no, email, photo, tel"
          + " from pms_member"
          + " where no = " + no);
        ResultSet rs = stmt.executeQuery()) {

    if (rs.next()) {
      email = rs.getString("email");
      photo = rs.getString("photo");
      tel = rs.getString("tel");

    } else {
      System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      return;
    }
    } catch(Exception e) {
      System.out.println("게시글 조회 중 오류 발생!");
      e.printStackTrace();
      return;
    }

    email = Prompt.inputString(String.format("이메일(%s)? ", email));
    photo = Prompt.inputString(String.format("사진(%s)? ", photo));
    tel = Prompt.inputString(String.format("전화(%s)? ", tel));

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/user1db?user=user1&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "update pms_member set email = ?, photo = ?, tel = ? where no = ?"))
    {

      stmt.setString(1, email);
      stmt.setString(2, photo);
      stmt.setString(3, tel);
      stmt.setInt(4, no);
      int count = stmt.executeUpdate();


    if(count == 0) {
      System.out.println("해당 번호의 멤버가 존재하지 않습니다.");
    } else {
    System.out.println("변경 완료!");
    }
    } catch(Exception e) {
      System.out.println("멤버 정보 변경 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
