package com.eomcs.oop.ex03;

import java.util.Scanner;

// 클래스 메서드 응용

public class Exam0310 {

  static class Math {
    // 다음 메서드와 같이 인스턴스 변수를 사용하지 않고
    // 파라미터 값을 가지고 작업하는 경우에 보통 클래스 메서드로 정의한다.

    public static int abs(int value) {
      if (value < 0)
        return value * -1;
      return value;
    }
  }

  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    System.out.print("숫자를 입력하세요>");
    int value = Scan.nextInt();

    // 이렇게 특정 인스턴스의 변수를 다루는 것이 아니라
    // 외부에서 전달한 파라미터 값을 가지고 작업을 수행하는 메서드인 경우
    // 클래스 메서드로 정의하면 편하다
    int result = Math.abs(value);

    System.out.printf("절대값=%d\n", result);
  }
}
