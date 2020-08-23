package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		System.out.println("[회원]");
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("번호? ");
	String no = scanner.nextLine();
	
	System.out.print("이름? ");
	String name = scanner.nextLine();
	
	System.out.print("이메일? ");
	String email = scanner.nextLine();
	
	System.out.print("암호? ");
	String password = scanner.nextLine();
	
	System.out.print("사진? ");
	String photo = scanner.nextLine();
	
	System.out.print("전화? ");
	String tel = scanner.nextLine();
	
	// 현재 일시 
	Date now = new Date(System.currentTimeMillis());
	
	scanner.close();
	
	System.out.println("-----------------------------------");
	
	System.out.println("번호: " + no);
	System.out.println("이름: " + name);
	System.out.println("이메일: " + email);
	System.out.printf("암호: %s\n", password);
	System.out.printf("사진: %s\n", photo);
	System.out.printf("전화: %s\n", tel);
	System.out.printf("가입일 : %s\n", now); 
	}
}
