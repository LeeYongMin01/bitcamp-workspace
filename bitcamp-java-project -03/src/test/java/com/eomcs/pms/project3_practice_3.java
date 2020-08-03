package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class project3_practice_3 {
  public static void main(String[] args) {

    System.out.println("[작업]");
    Scanner Scan = new Scanner(System.in);

    System.out.print("프로젝트? ");
    String project = Scan.nextLine();

    System.out.print("번호? ");
    int no = Scan.nextInt();
    Scan.nextLine();

    System.out.print("내용? ");
    String content = Scan.nextLine();

    System.out.print("완료일? ");
    Date completeDate = Date.valueOf(Scan.nextLine());

    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int status = Integer.valueOf(Scan.nextLine());

    System.out.print("담당자? ");
    String owner = Scan.nextLine();

    Scan.close();

    // 입력 받은 값들을 출력

    System.out.println("---------------------------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", completeDate);

    switch(status) {
      case 1:
        System.out.println("상태: 진행중");
        break;
      case 2:
        System.out.println("상태 : 완료");
        break;
        default:
          System.out.println("상태: 신규");
    }



    System.out.printf("담당자: %s\n", owner);

  }
}
