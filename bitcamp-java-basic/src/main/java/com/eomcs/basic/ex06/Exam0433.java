package com.eomcs.basic.ex06;

//# 흐름 제어문 - for 중첩과 break

public class Exam0433 {
  public static void main(String[] args) {
    // continue
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        if (j % 2 == 0)
          continue; // 다음 줄로 가지않고 '변수증가문'으로 이동
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
