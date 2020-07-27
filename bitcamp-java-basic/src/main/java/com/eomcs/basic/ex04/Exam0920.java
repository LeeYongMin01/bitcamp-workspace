package com.eomcs.basic.ex04;

public class Exam0920 {
  public static void main(String[] args) {
    float f = 3.14f;
    double d = 9876.56789;
    
    // 부동소수점 메모리의 값을 정수 메모리에 저장할 수 없다.
    // 왜?
    // - 정수 메모리는 소수점 이하의 값을 저장할 수 없기 때문에
    // 자바에서는 부동 소수점 값을 정수 메모리에 저장하는 것을
    // 문법에서 막음
    
    //int i = f;// 컴파일 오류 
    //long l = d; // 컴파일 오류
  }
}
