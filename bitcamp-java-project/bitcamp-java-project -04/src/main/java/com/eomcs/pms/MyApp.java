package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[회원]");
    int no1, no2, no3;
    String name1, name2, name3;
    String email1, email2, email3;
    String password1, password2, password3;
    String photo1, photo2, photo3;
    String tel1, tel2, tel3;
    Date now1, now2, now3;
    long currentMillis;

    // 1번 회원
    System.out.println("번호? ");
    no1 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("이름? ");
    name1 = scanner.nextLine();
    
    System.out.println("이메일? ");
    email1 = scanner.nextLine();
    
    System.out.println("암호? ");
    password1 = scanner.nextLine();
    
    System.out.println("사진? ");
    photo1 = scanner.nextLine();
    
    System.out.println("전화?");
    tel1 = scanner.nextLine();
    
    currentMillis = System.currentTimeMillis();
    now1 = new Date(currentMillis);
    System.out.println();
    
    // 2번 회원
    System.out.println("번호? ");
    no2 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("이름? ");
    name2 = scanner.nextLine();
    
    System.out.println("이메일? ");
    email2 = scanner.nextLine();
    
    System.out.println("암호? ");
    password2 = scanner.nextLine();
    
    System.out.println("사진? ");
    photo2 = scanner.nextLine();
    
    System.out.println("전화?");
    tel2 = scanner.nextLine();
    
    currentMillis = System.currentTimeMillis();
    now2 = new Date(currentMillis);
    System.out.println();
  
    // 3번 회원
    System.out.println("번호? ");
    no3 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("이름? ");
    name3 = scanner.nextLine();
    
    System.out.println("이메일? ");
    email3 = scanner.nextLine();
    
    System.out.println("암호? ");
    password3 = scanner.nextLine();
    
    System.out.println("사진? ");
    photo3 = scanner.nextLine();
    
    System.out.println("전화?");
    tel3 = scanner.nextLine();
    
    currentMillis = System.currentTimeMillis();
    now3 = new Date(currentMillis);
    System.out.println();
  
    scanner.close();
  
    System.out.println("--------------------------");
    System.out.printf("%d, %s, %s, %s, %s\n", no1, name1, email1, tel1, now1.toString());
    System.out.printf("%d, %s, %s, %s, %s\n", no2, name2, email2, tel2, now2.toString());
    System.out.printf("%d, %s, %s, %s, %s\n", no3, name3, email3, tel3, now3.toString());
  }
}
