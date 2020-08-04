package com.eomcs.basic.ex07;

public class Exam0222 {

  static void hello(String name, int age) {
    System.out.printf("%d살 %s님\n", age, name);
  }

  public static void main(String[] args) {
    // 파라미터의 타입, 개수, 순서가 일치해야함

    // hello("윤봉길"); // 오류
    // hello(20, "윤봉길"); // 오류
    // String r = hello("안중근", 30); // 오류
    // void r = hello("안중근", 30); // 오류

  }
}
