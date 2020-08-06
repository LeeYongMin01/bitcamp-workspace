package com.eomcs.oop.ex03;

public class Exam0161 {

  static class Member {
    String id;
    String password;
    int type; // 0: 손님, 1: 회원, 2: 관리자
  }
  public static void main(String[] args) {

    // Exam0160 예제의 문제점을 해결하기 위해 나온것이 상수이다.
    // 즉, 의미있는 이름으로 변수를 만들어 놓고 그 변수에 숫자를 저장한다.
    // 그리고 그 값을 사용할 때는 변수를 통해 사용한다.
    // 조회용으로 사용할 변수이기에 final로 선언한다.
    // 상수는 대문자로 선언

    final int GUEST = 0;
    final int MEMBER = 1;
    final int MANAGER = 2;

    // 상수 사용
    Member m4 = new Member();
    m4.id = "aaa";
    m4.password = "1111";
    m4.type = GUEST;

    Member m5 = new Member();
    m5.id = "bbb";
    m5.password = "1111";
    m5.type = MANAGER;

    Member m6 = new Member();
    m6.id = "ccc";
    m6.password = "1111";
    m6.type = MEMBER;
  }
}
