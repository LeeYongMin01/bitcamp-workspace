package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0210_class {

  public static void main(String[] args) {
    // 연산자 순서 없고 그냥 순서대로 계산한다는 가정하에
    // 식1) 2 + 3 - 1 * 7 / 3 = 9
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    // 식1과 식2를 동시에 계산할 수 있는가?
    // => 불가능
    // => Calculator 클래스는 result 변수를 한개만 관리하기 때문에
    // 동시에 여러개의 식 결과를 따로 관리할 수 없다.
    // /* */ 주석 처리



//    현재 버전에서는 식1과 식2를 차례대로 계산할 수 밖에 없다.
//    식1,식2를 동시에 계산하려면 result 변수를 두 개 준비해야 한다.

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    c2.plus(2);
    c2.plus(3);
    c2.minus(1);
    c2.multiple(7);
    c2.divide(3);

    printResult(c1.result);
    printResult(c2.result);
  // c1, c2로 나누면 순서가 뒤죽박죽 되어도 컴파일 결과가 올바르게 나온다.
    // this를 사용하면 인스턴스 주소값을 바로 줄 수 있다.
  }
  /*
    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    printResult(Calculator.result);
  }*/

  static void printResult(int value) {
    System.out.print("******************************");
    System.out.printf("==> 결과 = %d", value);
    System.out.print("******************************");
  }

}
