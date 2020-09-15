package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler_a {

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
      String name = Prompt.inputString("만든이? ");
      if(MemberHandler.findByName(name) != null) {
        project.owner = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }
    project.members = Prompt.inputString("팀원? ");
    
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