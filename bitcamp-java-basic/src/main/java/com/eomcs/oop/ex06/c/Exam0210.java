// 오버라이딩(overriding) - 오버라이딩 실수의 예
package com.eomcs.oop.ex06.c;

public class Exam0210 {
  public static void main(String[] args) {
    B2 obj = new B2();

    // B2에서 B의 m() 메서드를 오버라이딩(재정의) 했다고 착각하고
    // 메서드를 사용할 수 있다.
    // => 그런데 B2 클래스를 가보면 m()의 파라미터가 float이다.
    // 즉, 오버로딩을 한 것이 된다.
    obj.m(100); // B의 m(int) 메서드를 호출

    //해결방법
    // => @Override 사용
  }
}








