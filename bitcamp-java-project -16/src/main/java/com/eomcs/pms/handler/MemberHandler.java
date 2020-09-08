package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class MemberHandler {
  
  //Member 객체 목록을 저장할 ArrayList 객체를 준비한다.
  ArrayList memberList = new ArrayList();
  
  public void add() { 
    System.out.println("[회원 등록]");
    
      Member member = new Member();
      member.setNo(Prompt.inputInt("번호? "));
      member.setName(Prompt.inputString("이름? "));
      member.setEmail(Prompt.inputString("이메일? "));
      member.setPassword(Prompt.inputString("암호? "));
      member.setPhoto(Prompt.inputString("사진? "));
      member.setTel(Prompt.inputString("전화? "));
      member.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));
      
      memberList.add(member);
  }
  
  public void list() { 
    System.out.println("[회원 목록]");
    
   Object[] members = memberList.toArray();
    
    for (Object obj : members) {
      Member member = (Member) obj;
   System.out.printf("%d, %s, %s, %s, %s\n", 
            member.getNo(), 
            member.getName(), 
            member.getEmail(), 
            member.getTel(), 
            member.getRegisteredDate());
   }
  }
  
  public Member findByName(String name) {
    Object[] members = memberList.toArray();
    
    for (Object obj : members) {
      Member member = (Member) obj;
      if(member.getName().equals(name)) {
        return member;
      }
    }
    return null;
  }
}
