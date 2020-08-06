package com.eomcs.oop.ex03;

// 인스턴스 메서드와 클래스 메서드

public class Exam0210 {
  static class A{
    // 1) 클래스 메서드
    // => static이 붙은 메서드
    // => 클래스 이름으로 호출할 수 있음
    // => "스태틱 메서드"라고도 부른다.
    static void m1() {
      System.out.println("m1()");
    }

    // 2) 인스턴스 메서드
    // => static이 붙지 않은 메서드
    // => 인스턴스 주소가 있어야만 호출 가능

    void m2() {
      System.out.println("m2()");
    }

  }

  public static void main(String[] args) {
    // 클래스 메서드 호출
    // 문법) 클래스명.메서드명();
    A.m1(); // OK

    // => 인스턴스 메서드는 클래스 이름으로 호출 불가
    // A.m2(); // 오류

    A obj1 = new A();

    obj1.m1() // 가능은 하지만 다른 개발자와 혼동을 유발할 수 있기 때문에
    // 사용 비권장


    A obj2 = null;
    obj2.m2(); // 컴파일은 가능하지만 실행은 오류
    // => obj2 변수에 들어있는 인스턴스 주소가 무효하기 때문
  }


  // 결론
  // 클래스 메서드(= 스태틱 메서드)
  // => 인스턴스 변수를 사용하지 않을 경우 클래스 메서드로 선언해라
  // 인스턴스 메서드
  // => 인스턴스 변수를 사용할 경우 인스턴스 메서드로 선언해라

  // 실무
  // 일단 인스턴스 메서드로 만들어라
  // 인스턴스 변수를 사용하지 않음이 확실해지면 클래스 메서드로 전환해라




}
