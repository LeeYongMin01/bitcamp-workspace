package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.Exam0220.Calculator;

//# 관련된 기능(메서드)을 묶어 분류하기 - 클래스 메서드와 클래스 변수

public class Exam0230 {

  static class Caculator {
    // # 클래스 변수 사용
    // 메서드들의 작업 결과를 보관할 때 사용할 변수
    // 변수 선언에 static을 붙인다.
    // "스태틱 변수"라고도 부름
    // 클래스 변수는 new 명령으로 생성하지 않는다.
    // 클래스가 메모리에 로딩될 때 자동으로 "Method Area" 영역에 생성된다.
    static int result = 0;

    static void plus(int value) {
      result += value;
    }
    static void minus(int value) {
      result -= value; // result = result - value
    }

    static void multiple(int value) {
      result *= value; // result = result * value
    }

    static void divide(int value) {
      result /= value; // result = result / value
    }

    public static void main(String[] args) {

      int result = 0;

      result = Calculator.plus(2, 3);
      result = Calculator.minus(result, 1);
      result = Calculator.multiple(result, 7);
      result = Calculator.divide(result, 3);

      System.out.printf("result = %d\n", result);

    }
  }
}
