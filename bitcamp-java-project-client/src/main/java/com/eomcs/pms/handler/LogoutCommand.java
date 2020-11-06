package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;

public class LogoutCommand implements Command {


  MemberDao memberDao;

  public LogoutCommand(MemberDao memberDao) {
    this.memberDao = memberDao;
  }


  @Override
  public void execute(Map<String, Object> context) {
    System.out.println("[로그아웃]");

    Member member = (Member) context.get("loginUser");
    if(member == null) {
      System.out.println("로그인 한 정보가 없습니다.");
      return;
    }
    System.out.printf("%s 님 안녕히 가세요!\n", member.getName());

    context.remove("loginUser");
  }
}
