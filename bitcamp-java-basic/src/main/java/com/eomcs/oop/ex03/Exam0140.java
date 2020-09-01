package com.eomcs.oop.ex03;

import com.eomcs.oop.ex03.Exam0140.A;

public class Exam0140 {
  static class A {
    static int v1;
    int v2;
  }
  
  public static void main(String[] args) {
    
    // 클래스 변수는 클래스가 로딩되는 순간 바로 사용할 수 있다.
    // 클래스가 로딩되는 경우:
    // - 클래스 변수나 클래스 메서드를 사용할 때
    // - 인스턴스를 생성할 때
    // - 단 중복 로딩되지 않는다.
    A.v1 = 100;
    
    // v2 는 인스턴스 변수이기 때문에 사용하기 전에 new 명령으로 먼저 생성해야 한다.
    // A.v2 = 200; // 컴파일 오류!
    
    A p = new A();
    
    // 이제 v2 변수는 Heap에 생성되었다.
    // A클래스의 인스턴스를 만들 때
    // static 이 안붙은 변수가 그 대상이다.
    //
    // v2 인스턴스 변수는 인스턴스 주소를 통해 사용해야 한다.
    // 클래스이름으로 사용할 수 없다.
    // A.v2 = 200; // 컴파일 오류!
    
    p.v2 = 200; // OK!
    
    // 인스턴스 변수는 인스턴스를 만들 때 마다 생성된다.
    A p2 = new A(); // 새 v2 변수가 생성된다.
    p2.v2 = 300;

    System.out.printf("A.v1=%d, p.v2=%d, p2.v2=%d\n", A.v1, p.v2, p2.v2);
  }
}
