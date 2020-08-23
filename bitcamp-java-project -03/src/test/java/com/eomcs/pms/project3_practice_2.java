package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class project3_practice_2 {
  public static void main(String[] args) {

    System.out.println("[프로젝트]");

    Scanner Scan = new Scanner(System.in);

    System.out.print("번호? ");
    int no = Scan.nextInt();
    // nextInt()로 번호 뒤에 남아있는 줄바꿈 코드를
    // nextLine() 구문으로 제거해줘야한다.
    Scan.nextLine();

    System.out.print("프로젝트명? ");
    String name = Scan.nextLine();

    System.out.print("내용? ");
    String content = Scan.nextLine();

    System.out.print("시작일? ");
    Date startDate = Date.valueOf(Scan.nextLine());

    System.out.print("종료일? ");
    Date endDate = Date.valueOf(Scan.nextLine());

    System.out.print("만든이? ");
    String owner = Scan.nextLine();

    System.out.print("팀원? ");
    String members = Scan.nextLine();

    Scan.close();

    System.out.println("-----------------------------------------");


    // 입력 받은 값들을 출력

    System.out.printf("번호: %d\n", no);
    System.out.printf("프로젝트명: %s\n", name);
    System.out.printf("내용: %s\n", content);
    System.out.printf("시작일: %s\n", startDate);
    System.out.printf("종료일: %s\n", endDate);
    System.out.printf("만든이: %s\n", owner);
    System.out.printf("팀원: %s\n", members);





  }
}

