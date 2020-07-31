package com.eomcs.basic.ex06;

public class Exam0421 {
  public static void main(String[] args) {
    // 변수 초기화 시키는 문장에 여러개의 변수 선언 가능
    // 변수 증가문에 여러개의 문장 작성 가능

    for (int i = 1, j = 3, k = 5; i <= 10; i++, j--, k += 2)
      System.out.printf("(%d,%d,%d) ", i, j, k);
    System.out.println();

  }
}
