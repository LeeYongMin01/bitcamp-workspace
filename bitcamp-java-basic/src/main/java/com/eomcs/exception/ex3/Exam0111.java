// 예외 처리 - 개념
package com.eomcs.exception.ex3;

public class Exam0111 {
  
  static void m() {
    // 예외를 호출자에게 알려주는 문법
    // => throw [Throwable 객체];
    // throw new String("예외가 발생했습니다!"); // 오류
    throw new RuntimeException("예외가 발생했습니다!");
  }
  
  public static void main(String[] args) {
    
    // 예외를 받지 않는다면?
    m();
    // 즉시 현재 메서드의 실행을 멈추고 호출자에게 예외 처리를 위임한다.
    // 만약에 그 호출자가 JVM이라면 프로그램 실행을 종료한다.

    System.out.println("시스템을 종료합니다.");
  }
}