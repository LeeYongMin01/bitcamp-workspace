package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App_c {
  
  static Scanner scanner = new Scanner(System.in);

  // 회원 데이터
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];
  
  static int size = 0;

  // 프로젝트 데이터
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];
  
  static int psize = 0;
  
  
  
  
  public static void main(String[] args) {
	  
	  // 작업 데이터
	  final int TLENGTH = 100;
	  int[] tno = new int[TLENGTH];
	  String[] tcontent = new String[TLENGTH];
	  Date[] tdeadline = new Date[TLENGTH];
	  String[] towner = new String[TLENGTH];
	  int[] tstatus = new int[TLENGTH];
	  
	  int tsize = 0;
	  
	 loop:
	  while(true) {
    	System.out.print("명령>");
    	String command = scanner.nextLine();

    	switch(command) {
    	case "/member/add": 
    		addMember();
    		break;
    	case "/member/list":
    		listMember();
    		  break;
    		  
    	case "/project/add":
    		addProject();
    		break;
    	case "/project/list":
    		System.out.println("[프로젝트 등록]");
    		  for (int i = 0; i < psize; i++) {
    		 System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
    				 pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    		 }
    		  break;
    	
    	case "/task/add":
    		System.out.println("[작업 등록]");
    		
    		System.out.print("번호? ");
    		tno[tsize] = Integer.parseInt(scanner.nextLine());
    		
    		System.out.print("내용? ");
    		tcontent[tsize] = scanner.nextLine();
    		
    		System.out.print("마감일? ");
    		tdeadline[tsize] = Date.valueOf(scanner.nextLine());

    		System.out.println("상태? ");
    		System.out.println("0: 신규");
    		System.out.println("1: 진행중");
    		System.out.println("2: 완료");
    		System.out.print("> ");
    		tstatus[tsize] = Integer.valueOf(scanner.nextLine());
    		
    		System.out.print("담당자? ");
    		towner[tsize] = scanner.nextLine();
    		
    		tsize++;
    		break;
    	case "/task/list":
    		System.out.println("[작업 목록]");
    		  for (int i = 0; i < tsize; i++) {
    			  String stateLabel = null;
    			  switch (tstatus[i]) {
    			  case 1:
    				  stateLabel = "진행중";
    				  break;
    			  case 2:
    				  stateLabel = "완료";
    			  default:
    				  stateLabel = "신규";
    			  }
    		 System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
    		          tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
    		 }
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
    
	  scanner.close();
  
 }
  
  static void addMember() {
    System.out.println("[회원 등록]");
    
    System.out.print("번호? ");
      no[size] = Integer.parseInt(scanner.nextLine());

      System.out.print("이름? ");
      name[size] = scanner.nextLine();

      System.out.print("이메일? ");
      email[size] = scanner.nextLine();

      System.out.print("암호? ");
      password[size] = scanner.nextLine();

      System.out.print("사진? ");
      photo[size] = scanner.nextLine();

      System.out.print("전화? ");
      tel[size] = scanner.nextLine();

      registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

      size++;
  }
  
  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
   System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
            no[i], name[i], email[i], tel[i], registeredDate[i]);
   }
  }
    
    static void addProject() {
      System.out.println("[프로젝트 등록]");
      
      System.out.print("번호? ");
      pno[psize] = Integer.valueOf(scanner.nextLine());
      
      System.out.print("프로젝트명? ");
      ptitle[psize] = scanner.nextLine();
      
      System.out.print("내용? ");
      pcontent[psize] = scanner.nextLine();
      
      System.out.print("시작일? ");
      pstartDate[psize] = Date.valueOf(scanner.nextLine());
      
      System.out.print("종료일? ");
      pendDate[psize] = Date.valueOf(scanner.nextLine());
      
      System.out.println("만든이? ");
      powner[psize] = scanner.nextLine();
      
      System.out.println("팀원? ");
      pmembers[psize] = scanner.nextLine();
      
      psize++;
  }
}
