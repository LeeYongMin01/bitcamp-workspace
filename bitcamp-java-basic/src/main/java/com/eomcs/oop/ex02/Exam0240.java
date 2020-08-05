package com.eomcs.oop.ex02;

// # 관련된 기능(메서드)을 묶어 분류하기 - 클래스 변수의 한계


public class Exam0240 {

  static class Calculator {

  //클래스 변수는 클래스가 로딩될 때 한번 생성된다.
  static int result = 0;

  static void plus(int value) {
    result += value; // result = result + value
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

}


  // 다음 두 개의 식을 분리하여 계산해 보자!
  // - 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
  // 식1) 2 + 3 - 1 * 7 / 3 = ?
  // 식2) 3 * 2 + 7 / 4 - 5 = ?

  // 클래스 변수는 오직 한 개만 존재하기 때문에
  // 여러 개의 작업을 동시에 진행할 수 없다.
  // 한 개의 식을 계산한 후에 다른 식을 계산해야 한다.



  public static void main(String[] args) {

// 식1)

    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    System.out.printf("result = %d\n", Calculator.result);


// 식2)

    Calculator.result = 0;

    Calculator.plus(3);
    Calculator.multiple(2);
    Calculator.plus(7);
    Calculator.divide(4);
    Calculator.minus(5);

    System.out.printf("result = %d\n", Calculator.result);
  }
}
