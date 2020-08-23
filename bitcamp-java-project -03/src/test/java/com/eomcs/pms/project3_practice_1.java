package com.eomcs.pms;

import java.util.Scanner;

public class project3_practice_1 {
  public static void main(String[] args) {
    System.out.println("[회원]");

    Scanner Scan = new Scanner(System.in);

    System.out.print("번호? ");
    String no = Scan.nextLine();

    System.out.print("이름? ");
    String name = Scan.nextLine();

    System.out.print("이메일? ");
    String email = Scan.nextLine();

    System.out.print("암호? ");
    String password = Scan.nextLine();

    System.out.print("사진? ");
    String photo = Scan.nextLine();

    System.out.print("전화? ");
    String tel = Scan.nextLine();

    // 현재 시간
    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());

    Scan.close(); // 데이터 입출력이 끝났으면 도구를 닫아야함

    System.out.println("------------------------------------");
    System.out.println("번호: " + no);
    System.out.println("이름: " + name);
    System.out.println("이메일 : " + email);
    System.out.printf("암호 : %s\n", password);
    System.out.printf("사진 : %s\n", photo);
    System.out.printf("전화 : %s\n", tel);
    System.out.printf("가입일 : %s\n", now);









  }
}
