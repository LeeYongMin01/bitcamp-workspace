package com.eomcs.basic.ex06;

//# 흐름 제어문 - switch 문법 II

public class Exam0242 {

  // 상수를 조금 더 조직적으로 관리하는 법
  // => enum을 이용
  // => nested enum은 기본이 static 타입이기 때문에 생략가능
  //
  enum Level {
    GUEST, MEMBER, ADMIN
  }

  public static void main(String[] args) {
    // enum으로 정의된 상수를 사용하려면
    // enum 타입의 변수를 선언해야함
    // => final int 처럼 직접 값을 지정하지 않아도 됨
    // => 값을 직접 지정할 수도 있음

    // enum을 사용하면 100, 200, "admin"과 같이 값을 직접 지정할 필요가 없음
    // => enum 변수에는 그 타입에 정의된 값만 저장할 수 있기 때문
    //

    Level level = Level.MEMBER;


    // ex)

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능");
        break;
      case MEMBER:
      System.out.println("글 작성 가능");
      case ADMIN:
      System.out.println("다른 회원의 글을 변경, 삭제할 수 있음");
      break;



    }


  }





}
