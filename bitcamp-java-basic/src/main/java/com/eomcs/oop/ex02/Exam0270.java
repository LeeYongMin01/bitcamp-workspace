package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.Exam0260.Calculator;

//# 관련된 기능(메서드)을 묶어 분류하기 - 패키지 멤버 클래스

public class Exam0270 {

  //Calculator 클래스를 향후 유지보수하기 쉽도록 별도의 파일로 분리
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
