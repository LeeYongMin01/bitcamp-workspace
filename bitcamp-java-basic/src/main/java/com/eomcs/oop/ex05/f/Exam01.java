package com.eomcs.oop.ex05.f;

// 상속 - 생성자 호출 순서

public class Exam01 {
  public static void main(String[] args) {
    C obj = new C();
    obj.v1 = 100;
    obj.v2 = 200;
    obj.v3 = 300;
    System.out.printf("v1=%d, v2=%d, v3=%d\n", obj.v1, obj.v2, obj.v3);


  }
}
