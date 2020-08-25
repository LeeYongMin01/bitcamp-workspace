package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class MyApp {
	static class Member {
		int no;
		String name;
		String email;
		String password;
		String photo;
		String tel;
		Date now;
	}
	
	static final int LENGTH = 3;
	static Member[] members = new Member[LENGTH];
	static int size = 0;
	
  public static void main(String[] args) {
	  System.out.println("[회원]");

	  inputMembers();
  
    System.out.println("--------------------------");
    
    printMembers();
  } 
  
	static void inputMembers() {
		Scanner scanner = new Scanner(System.in);

	   // 회원 정보
	   for(int i = 0; i < LENGTH; i++) {
		   
		Member member = new Member();
		
	    System.out.print("번호? ");
	    
	    member.no = Integer.parseInt(scanner.nextLine());
	    
	    System.out.print("이름? ");
	    member.name = scanner.nextLine();
	    
	    System.out.print("이메일? ");
	    member.email = scanner.nextLine();
	    
	    System.out.print("암호? ");
	    member.password = scanner.nextLine();
	    
	    System.out.print("사진? ");
	    member.photo = scanner.nextLine();
	    
	    System.out.print("전화? ");
	    member.tel = scanner.nextLine();
	    
	    member.now = new Date(System.currentTimeMillis());
	    
	    members[size++] = member;
	    System.out.println();
	    
	    System.out.println("계속 입력하시겠습니까?(y/N) ");
	    String str = scanner.nextLine();
	    if(!str.equalsIgnoreCase("y")) { // y값이 아니라면 문장 종료
	    	break;
	    }
	    System.out.println();
	   }
	    scanner.close();
	} 
	
	static void printMembers() {
	for(int i = 0; i < size; i++) {
		Member m = members[i];
    System.out.printf("%d, %s, %s, %s, %s\n",
    		m.no, m.name, m.email, m.tel, m.now);
	}
}
}