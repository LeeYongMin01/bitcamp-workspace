package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class MyApp3 {
	public static void main(String[] args) {
		System.out.println("[작업]");
	Scanner scanner = new Scanner(System.in);

	System.out.print("프로젝트? ");
	String project = scanner.nextLine();

	System.out.print("번호? ");
	int no = Integer.parseInt(scanner.nextLine());

	System.out.print("내용? ");
	String content = scanner.nextLine();

	System.out.print("마감일? ");
	Date deadline = Date.valueOf(scanner.nextLine());

	System.out.println("상태? ");
	Date endDate = Date.valueOf(scanner.nextLine());
	System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int status = Integer.valueOf(scanner.nextLine());

	System.out.print("담당자? ");
	String owner = scanner.nextLine();

	scanner.close();

	System.out.println("-----------------------------------");

	System.out.printf("프로젝트: %s\n" , project);
	System.out.printf("번호: %s\n" , no);
	System.out.printf("내용: %s\n", content);
	System.out.printf("마감일: %s\n", deadline);

	switch(status) {
	  case 1 :
	    System.out.println("상태: 진행중");
	    break;
	  case 2 :
	    System.out.println("상태: 완료");
	    break;
	  case 3:
	    System.out.println("상태: 신규");
	}
	System.out.printf("담당자: %s\n", owner);
	}
}
