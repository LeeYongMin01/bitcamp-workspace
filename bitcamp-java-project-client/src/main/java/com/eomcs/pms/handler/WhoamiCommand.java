package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;

public class WhoamiCommand implements Command {

  MemberDao memberDao;

  public WhoamiCommand(MemberDao memberDao) {
    this.memberDao = memberDao;
  }


  @Override
  public void execute(Map<String, Object> context) {
    System.out.println("[WhoAmI]");

    Member member = (Member) context.get("loginUser");
    if(member == null) {
      System.out.println("로그인 한 정보가 없습니다.");
      return;
    }

    System.out.printf("사용자 번호: %d\n", member.getNo());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("전화: %s\n", member.getTel());
    System.out.printf("등록일: %s\n", member.getRegisteredDate());

  }
}
