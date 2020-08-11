package com.eomcs.oop.ex06.a;

// 다형성 - 다형적 변수

public class Exam0113 {

  public static void main(String[] args) {

  Vehicle v = new Vehicle();
  Bike b = new Bike();
  Car c = new Car();
  Sedan s = new Sedan();
  Truck t = new Truck();

  Bike b2 = null;

  // 같은 부모의 자식 클래스라도
  // 다른 클래스의 인스턴스는 가리킬 수 없다.
  // => Bike 클래스의 인스턴스 변수를 가지고 있지 않기 때문

  b2 = c; // 오류

  // => 당연히 다른 클래스의 자식 인스턴스도 가리킬 수 없다.
  b2 = s; // 오류
  b2 = t; // 오류



  }

}
