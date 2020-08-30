package com.eomcs.oop.ex02;

// # 관련된 기능(메서드)을 묶어 분류하기 : 분류 전

public class Exam0210 {

  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위 고려하지않고 순서대로 계산
    // 2 + 3 - 1 * 7 / 3 = ?

    // 계산 담을 결과 변수 준비
    int result = 0;

    // 메서드를 호출하여 작업을 수행하고,
    // 리턴 결과는 로컬 변수에 저장한다.

    result = plus(2, 3);
    result = minus(result, 1);
    result = multiple(result, 7);
    result = divide(result, 3);

    System.out.printf("result = %d\n", result);

  }

  static int plus(int a, int b) {
    return a + b;
  }

  static int minus(int a, int b) {
    return a - b;
  }

  static int multiple(int a, int b) {
    return a * b;
  }

  static int divide(int a, int b) {
    return a / b;
  }
}

// 클래스 문법의 용도
// 1) 사용자 정의의 데이터 타입을 만들 때
// 2) 메서드를 묶을 때
// - 서로 관련된 기능을 묶어서 관리하기 쉽게 사용
