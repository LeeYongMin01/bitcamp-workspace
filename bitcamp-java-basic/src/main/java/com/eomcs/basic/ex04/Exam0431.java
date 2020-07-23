package com.eomcs.basic.ex04;

//문자 변수 - 변수의 메모리 크기

public class Exam0431 {
  public static void main(String[] args) {

    // 자바는 각 글자를 0~65535 까지의 16비트 코드 값으로 저장한다.
    // 자바는 2바이트 크기의 메모리를 사용한다.
    
    char c;
    
    c = 0;
    c = 65535;
    
    // char(2byte) 크기의 메모리 범위를 초과하면 문법 오류이다.
    // c = -1; // 컴파일 오류
    // c = 65536; // 컴파일 오류
    

  }
}
