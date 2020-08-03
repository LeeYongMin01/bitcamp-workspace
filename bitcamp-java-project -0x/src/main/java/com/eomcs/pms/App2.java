package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;



public class App2 {

  public static void main(String[] args) {

    class Project {
      int no;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String owner;
      String members;

    }
    // 여러개의 프로젝트 정보를 입력받기 위해 변수 준비

    final int LENGTH = 100;
    Project[] projects = new Project[LENGTH];

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[프로젝트]");



    int count =  0;

    for (int i = 0; i < LENGTH; i++) {
      count++;

      Project p = new Project();

      System.out.print("번호? ");
      p.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? " );
      p.title = keyInput.nextLine();

      System.out.print("내용? ");
      p.content = keyInput.nextLine();

      System.out.print("시작일? ");
      p.startDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      p.endDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      p.owner = keyInput.nextLine();

      System.out.print("팀원? ");
      p.members = keyInput.nextLine();

      System.out.println();

      projects[i] = p;

      System.out.print("계속 입력?(y/N) ");
      String response = keyInput.nextLine();



      if (!response.equalsIgnoreCase("y") == false) {
        break;
      }
    }

    keyInput.close();

    System.out.println("--------------------------");


    for (int i = 0; i < count; i++) {
      Project p = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          p.no,
          p.title,
          p.startDate,
          p.endDate,
          p.owner);
    }
  }
}
