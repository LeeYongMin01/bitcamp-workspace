package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class project4_practice_1 {

  static class Member{
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registeredDate;
  }
  static final int LENGTH = 5;

  static Member[] members = new Member[LENGTH];
  static int count = 0;

  public static void main(String[] args) {
    System.out.println("[회원]");

    inputMembers();

    System.out.println("------------------------------------------");

    printMembers();
  }

  static void inputMembers() {
    Scanner scan = new Scanner(System.in);


    for (int i = 0; i < LENGTH; i++) {
    Member member = new Member();

    System.out.print("번호? ");
    member.no= Integer.parseInt(scan.nextLine());

    System.out.print("이름? ");
    member.name = scan.nextLine();

    System.out.print("이메일? ");
    member.email = scan.nextLine();

    System.out.print("암호? ");
    member.password = scan.nextLine();

    System.out.print("사진? ");
    member.photo = scan.nextLine();

    System.out.print("전화? ");
    member.tel = scan.nextLine();

    member.registeredDate = new java.sql.Date(System.currentTimeMillis());

    members[count++] = member;
    System.out.println(); // 빈 줄 출력

    System.out.print("계속 입력?(y/N)");
    String str = scan.nextLine(); //계속 입력할지를 받는 변수 선언

    if(!str.equalsIgnoreCase("y")) {
      break;
    }
    System.out.println();
}
    scan.close();
  }
    static void printMembers() {

      for (int i = 0; i < count; i++) {
        Member m = members[i];
        System.out.printf("%d, %s, %s, %s, %s\n",
            m.no, m.name, m.email, m.tel, m.registeredDate);
      }

    }



    }

