package com.eomcs.basic.ex06;

//# 흐름 제어문 - if ~ else 문

public class Exam0140 {
  public static void main(String[] args) {
    int age = 17;

    // if문은 else 문 없이 단독으로 사용 가능
    if (age < 19)
      System.out.println("미성년");

    // else문을 사용하는 좋은 예
    if (age >= 19) // 조건이 거짓이면 다음 else문을 실행
      System.out.println("성인");
    else
      System.out.println("미성년");

    // 문장을 실행할 때 블록으로 묶어야함
    if(age >= 20) {
      System.out.println("--------------");
      System.out.println("성인");
    }
    else {
      System.out.println("--------------");
      System.out.println("미성년");
    }

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (age >= 19) { // OK!
      System.out.println("성인입니다.");
      System.out.println("--------------------------");
    }
    else
      System.out.println("미성년입니다.");

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (age >= 19)
      System.out.println("성인입니다.");
    else {
      System.out.println("미성년입니다.");
      System.out.println("--------------------------");
    }

  }

}
