package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App_g {

  public static void main(String[] args) {
	  
	  Scanner scanner = new Scanner(System.in);
	  final int LENGTH = 100;
	  
	  
	  // 회원 데이터
	  int[] no = new int[LENGTH];
	  String[] name = new String[LENGTH];
	  String[] email = new String[LENGTH];
	  String[] password = new String[LENGTH];
	  String[] photo = new String[LENGTH];
	  String[] tel = new String[LENGTH];
	  Date[] registeredDate = new Date[LENGTH];
	  
	  int size = 0;
    
	  // 프로젝트 데이터
	  final int PLENGTH = 100;
	  int[] pno = new int[PLENGTH];
	  String[] ptitle = new String[PLENGTH];
	  String[] pcontent = new String[PLENGTH];
	  Date[] pstartDate = new Date[PLENGTH];
	  Date[] pendDate = new Date[PLENGTH];
	  String[] powner = new String[PLENGTH];
	  String[] pmembers = new String[PLENGTH];
	  
	  int psize = 0;
	  
	 loop:
	  while(true) {
    	System.out.print("명령>");
    	String command = scanner.nextLine();

    	switch(command) {
    	case "/member/add": // 멤버 정보 추가
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
    		break;
    	case "/member/list":
    		System.out.println("[회원 목록]");
    		  for (int i = 0; i < size; i++) {
    		 System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
    		          no[i], name[i], email[i], tel[i], registeredDate[i]);
    		 }
    		  break;
    		  
    	case "/project/add":
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
    		break;
    				
    	case "exit":
    	case "quit":
    		System.out.println("안녕!");
    		break loop;
    	default:
    		System.out.println("실행할 수 없는 명령입니다.");
    	}
	  }
    
	  scanner.close();
  }
}
