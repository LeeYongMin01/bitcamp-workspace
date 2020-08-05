package com.eomcs.oop.ex02;

// # 관련된 기능(메서드)을 묶어 분류하기 - 인스턴스 변수와 인스턴스 메서드

public class Exam0260 {

  static class Calculator {
    int result = 0;

    // 인스턴스 변수를 다룰 때는 인스턴스 메서드를 사용하는 것이 편하다
    // => 파라미터로 따로 인스턴스의 주소를 받을 필요가 없기 때문에

    void plus(int value) {
      // 인스턴스 메서드는 인스턴스의 주소를 this라는 내장 변수에 자동으로 받음
      this.result += value;
    }

    void minus(int value) {
      this.result -= value;
    }
    void multiple(int value) {
      this.result *= value;
    }

    void divide(int value) {
      this.result /= value;
    }
  }

  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2);
    c2.plus(3);

    c1.plus(3);
    c2.multiple(2);

    c1.minus(1);
    c2.plus(7);

    c1.multiple(7);
    c2.divide(4);

    c1.divide(3);
    c2.minus(5);


    System.out.printf("c1.result = %d\n", c1.result);
    System.out.printf("c2.result = %d\n", c2.result);

  }
}
