package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler_c {

  // 프로젝트 데이터
  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }

  static final int LENGTH = 100; 
  static Project[] list = new Project[LENGTH];
  static int size = 0;
  
  public static void add() { 
    System.out.println("[프로젝트 등록]");
    
    Project project = new Project();
    project.no = Prompt.inputInt("번호? ");
    project.title = Prompt.inputString("프로젝트명? ");
    project.content = Prompt.inputString("내용? ");
    project.startDate = Prompt.inputDate("시작일? ");
    project.endDate = Prompt.inputDate("종료일? ");
    while(true) {
      String name = Prompt.inputString("만든이?(취소: 빈 문자열) ");
      
      if(name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if(MemberHandler.findByName(name) != null) {
        project.owner = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }
    
    StringBuilder members = new StringBuilder();
    while(true) {
     String name = Prompt.inputString("팀원?(완료: 빈 문자열) ");
      
     if(name.length() == 0) {
       break;
     } else if (MemberHandler.findByName(name) != null) {
       if(members.length() > 0) {
         members.append(",");
       }
       members.append(name);
     } else {
       System.out.println("등록된 회원이 아닙니다.");
     }
    }
    project.members = members.toString();

    list[size++] = project;
}
  
  public static void list() {
    System.out.println("[프로젝트 등록]");
    
    for (int i = 0; i < size; i++) {
      Project project = list[i];
   System.out.printf("%d, %s, %s, %s, %s\n",
           project.no, project.title, project.startDate, project.endDate, project.owner);
   }
  }
}
