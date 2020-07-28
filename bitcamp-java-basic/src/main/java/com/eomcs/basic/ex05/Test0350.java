package com.eomcs.basic.ex05;

// # 비트 연산자 (&, |, ^, ~)
//
public class Test0350 {
  public static void main(String[] args) {
    int a = 0b0110_1100;
    int b = 0b0101_0101;
    
    // 정수 값에 대해서는 &&와 ||, !을 사용할 수 없다.
    //System.out.println(a && b); // 컴파일 오류!
    //System.out.println(a || b); // 컴파일 오류!
    //System.out.println(!a); // 컴파일 오류!
    
    // 그러나 &, |, ^, ~는 사용할 수 있다.
    // => 각 비트 단위로 연산을 수행한다.
    // => 1은 true, 0은 false라고 간주하고 계산한다.
    // => 출력 결과도 정수이다.

    System.out.println(a & b);
    // a = 0000 0000 0000 0000 0000 0000 0110 1100
    // b = 0000 0000 0000 0000 0000 0000 0101 0101
    // --------------------------------------------
    //     0000 0000 0000 0000 0000 0000 0100 0100 = 68

    System.out.println(a | b);
    // a = 0000 0000 0000 0000 0000 0000 0110 1100
    // b = 0000 0000 0000 0000 0000 0000 0101 0101
    // --------------------------------------------
    //     0000 0000 0000 0000 0000 0000 0111 1101 = 125

    System.out.println(a ^ b);
    // a = 0000 0000 0000 0000 0000 0000 0110 1100
    // b = 0000 0000 0000 0000 0000 0000 0101 0101
    // --------------------------------------------
    //     0000 0000 0000 0000 0000 0000 0011 1001 = 57

    // 비트 연산에서 not은 ! 연산자가 아니라 ~ 연산자 이다.
    System.out.println(~a);
    // a = 0000 0000 0000 0000 0000 0000 0110 1100
    // --------------------------------------------
    //     1111 1111 1111 1111 1111 1111 1001 0011 = -109
  
  
  
  
  
  }

  
}
