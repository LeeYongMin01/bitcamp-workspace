package com.eomcs.pms;

import java.sql.Date;

public class App_c {
  
  // 작업 데이터
  static class Task {
    int no;
    String content;
    Date deadline;
    String owner;
    int status;
  }
  
  static final int TLENGTH = 100;
  static Task[] tasks = new Task[TLENGTH];
  static int tsize = 0;
  
  public static void main(String[] args) {
	  
	 loop:
	  while(true) {
    	String command = Prompt.inputString("명령> ");

    	switch(command) {
    	case "/member/add": 
    		MemberHandler.add();
    		break;
    	case "/member/list":
    		MemberHandler.list();
    		  break;
    		  
    	case "/project/add":
    		ProjectHandler.add();
    		break;
    	case "/project/list":
    		ProjectHandler.list();
    		  break;
    	
    	case "/task/add":
    		addTask();
    		break;
    	case "/task/list":
    		listTask();
    		  break;
    		  
    	case "exit":
    	case "quit":
    		System.out.println("안녕!");
    		break loop;
    	default:
    		System.out.println("실행할 수 없는 명령입니다.");
    	}
    	System.out.println();
	  }
  Prompt.close();
 }
 
    static void addTask() {
      System.out.println("[작업 등록]");
      
      Task task = new Task();
      task.no = Prompt.inputInt("번호? ");
      task.content = Prompt.inputString("내용? ");
      task.deadline = Prompt.inputDate("마감일? ");
      task.status = Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
      task.owner = Prompt.inputString("담당자? ");
      
      tasks[tsize++] = task;
    }
    
    static void listTask() {
      System.out.println("[작업 목록]");
      
      for (int i = 0; i < tsize; i++) {
          Task task = tasks[i];
          String stateLabel = null;
          switch (task.status) {
          case 1:
              stateLabel = "진행중";
              break;
          case 2:
              stateLabel = "완료";
              break;
          default:
              stateLabel = "신규";
          }
     System.out.printf("%d, %s, %s, %s, %s\n", 
              task.no, task.content, task.deadline, stateLabel, task.owner);
     }
    }
    
}
