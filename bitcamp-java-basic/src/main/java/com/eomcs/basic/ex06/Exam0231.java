package com.eomcs.basic.ex06;

//# 흐름 제어문 - switch 문법

public class Exam0231 {
  public static void main(String[] args) {


    // case에는 리터럴만 올 수 있음
    // 즉, 변수 사용 불가
    int x = 1, y = 300;
    switch (x) {
      case 1 * 300: // OK
      // case 1 * y: // 컴파일 오류

    }


  }
}
