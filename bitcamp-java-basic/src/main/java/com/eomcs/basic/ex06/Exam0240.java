package com.eomcs.basic.ex06;

//# 흐름 제어문 - switch 문법 II

public class Exam0240 {
  public static void main(String[] args) {
    int level = 1;

    // 상수를 사용하지 않았을 때
    // => 값의 의미를 주석으로 달아야 다른 개발자가 이해 가능

    switch (level) {
      case 0: // 손님
        System.out.println("조회만 가능");
        break;
      case 1: // 일반회원
        System.out.println("글 작성 가능");
        break;
      case 2: // 관리자
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있음");
        break;
    }
  }
}
