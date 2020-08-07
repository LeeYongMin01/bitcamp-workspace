package com.eomcs.oop.ex03;


// 클래스 변수의 응용 : 클래스 변수 활용 전

public class Exam0160 {

  static class Member {
    String id;
    String password;
    int type; // 0 : 손님, 1: 회원, 2: 관리자
  }


  public static void main(String[] args) {
    Member m1 = new Member();
    m1.id = "aaa";
    m1.password = "1111";
    m1.type = 0;

    Member m2 = new Member();
    m2.id = "bbb";
    m2.password = "1111";
    m2.type = 2;

    Member m3 = new Member();
    m3.id = "ccc";
    m3.password = "1111";
    m3.type = 1;

    // 회원의 타입을 지정할 때 숫자를 이용하였다.
    // 시간이 지남에 따라 숫자의 의미를 기억하기 쉽지 않으니
    // 상수를 사용해야 한다.

  }
}

