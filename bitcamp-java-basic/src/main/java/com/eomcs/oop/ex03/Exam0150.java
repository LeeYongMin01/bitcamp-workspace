package com.eomcs.oop.ex03;

//# 클래스 변수와 인스턴스 변수 응용

public class Exam0150 {
  static class Car {

    // 클래스 필드 = 스태틱 필드
    //- 모든 인스턴스가 공유하는 값을 저장하는 용도이다.
    // 클래스 필드는 인스턴스를 생성할 필요 없이 클래스 이름으로 바로 사용 가능
    static int count
    ;

    // 인스턴스 필드
    // 개별적으로 관리되어야 할 값을 저장하는 용도
    // 인스턴스 필드는 new 명령을 수행해야지만 생성
    static final int SEDAN = 1; // static을 선언하면 Method Area에 Car.class 안에 만들어짐
    static final int TRUCK = 2; // Heap 영역에 X

    String model;
    String no;
    int cc;
    int type;
  }



  public static void main(String[] args) {
// 인스턴스 필드는 인스턴스의 주소(s1)가 있어야만 접근 가능
// 클래스 이름으로는 인스턴스 필드에 접근할 수 없음
// A.model = "티코"; // 오류

    Car c1 = new Car();
    Car c2 = new Car();
    c1.model = "티코";
    c1.no = "40-1111";
    c1.cc = 980;
    c1.type = Car.SEDAN; // 승용차

    Car.count++; //이 처럼 클래스 필드는 클래스 이름으로 사용!

    c2.model = "타이탄";
    c2.no = "50-2222";
    c2.cc = 10000;
    c2.type = Car.TRUCK; // 트럭

    Car.count++; //이 처럼 클래스 필드는 클래스 이름으로 사용!



    System.out.printf("%s, %s, %d\n", c1.model, c1.no, c1.cc);
    System.out.printf("%s, %s, %d\n", c2.model, c2.no, c2.cc);

    // 클래스 필드에 접근할 때는 다음과 같이 레퍼런스를 통해서도 접근할 수 있음
    System.out.println(Car.count);
    // 인스턴스에 count라는 변수가 없으면 클래스에서 찾는다.
    // 하지만 이렇게 사용하지 말라
    // 다른 개발자가 봤을 때 착각할 여지가 있음
  }
}
