package com.eomcs.basic.ex06;

//# 흐름 제어문 - 조건문 if에 여러 문장을 묶기

public class Exam0120 {
  public static void main(String[] args) {
    int age = 17;

    // => if (조건) {문장1; 문장2;}
    //    조건이 참일 때 여러개의 문장을 실행하고 싶다면 중괄호를 이용
    // => 중괄호로 묶지 않으면 첫번째 문장만 if에 종속됨
    // => 들여쓰기는 문법에 영향X
    if (age >= 19)
      System.out.println("성인"); // 이 문장만 if에 소속
      System.out.println("군대");
      System.out.println("일");
      System.out.println("세금 납부");
      System.out.println("----------------------------------");

    // 여러 문장을 if문에 종속시키고 싶으면, 블록 ({}) 사용
      if (age >= 19) {
        System.out.println("성인");
        System.out.println("군대");
        System.out.println("일");
        System.out.println("세금 납부");
      }



    }
  }

