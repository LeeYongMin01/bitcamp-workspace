package com.eomcs.basic.ex06;

//# 흐름 제어문 - for 반복문

public class Exam0412 {
  public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감문) 문장;

    // 변수선언 및 초기화 문장 제거
    int i = 1;
    for (; i <= 5;) {
      System.out.println(i);
      i++;
    }
  }
}