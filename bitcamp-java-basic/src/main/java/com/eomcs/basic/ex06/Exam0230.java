package com.eomcs.basic.ex06;


//# 흐름 제어문 - switch 문법

public class Exam0230 {
  public static void main(String[] args) {
    // switch(값){}
    // 값으로 가능한 데이터 타입)
    // int 정수(byte,short,int,char), 문자열, 특별한 상수 Enum타입
    // => case 값으로 변수를 사용할 수 없다. 리터럴만 가능

    byte b = 2;
    switch (b) {
      case 1:
      case 2:
      default:
    }

    short s = 2;
    switch (s) {
      case 1:
      case 2:
      default:
    }

    int i = 2;
    switch (i) {
      case 1:
      case 2:
      default:
    }

    chat c = 'A'; // A문자의 유니코드 값을 c에 저장함
    switch (c) {
      // case의 값도 int값이면 무엇이든 됨
      case 'A': // 0x41 = 65
      case 66:
      case 0x43:
      default:
    }

    // String 값을 switch와 case의 값으로 사용할 수 있다.
    String str = "hello";
    switch (str) {
      // case 의 값으로 String 가능하다.
      case "hello":
      case "ohora":
      case "hul":
      default:




    }
  }
}
