// inner class : 다른 멤버가 중첩 클래스 사용하기
package com.eomcs.oop.ex11.c;

class C {
  static void m1() {
    // 스태틱 멤버는 인스턴스 멤버를 사용할 수 없다.
    // X obj = new X(); // 오류
    // obj.test();
    
    // 이유?
    // 인스턴스 멤버를 사용하려면 인스턴스 주소가 필요한데, 
    // 스태틱 메서드는 인스턴스 주소를 담고 있는 this 변수가 존재하지 않는다.
  }
  
  void m2() {
    // 인스턴스 메서드는 인스턴스 주소를 담고 있는 this 변수가 있다.
    // 그래서 inner class를 사용할 수 있다.
    X obj = this.new X();
    obj.test();
  }
  
  class X {
    void test() {
     System.out.println("X.test()");
    }
  }
}

public class Exam0310 {
  public static void main(String[] args) {
    C.m1();
    
    C outer = new C();
    outer.m2();
  }
}
