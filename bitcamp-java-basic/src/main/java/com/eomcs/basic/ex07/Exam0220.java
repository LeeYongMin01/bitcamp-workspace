package com.eomcs.basic.ex07;


//  # 메서드 : 개념 및 기본 문법 2

  public class Exam0220 {


//예2) 메서드 : 리턴값(x), 파라미터(o)
//메서드 블록을 실행할 때 값이 필요하다면 파라미터 변수를 선언!
static void hello(String name, int age) {
  //파라미터?
  //메서드를 실행할 때 사용할 값을 외부로부터 받기위해 선언한 로컬 변수
  //메서드를 실행할 때 생성되고 메서드 실행이 끝나면 제거된다.
  System.out.printf("%d살 %s님 \n", age, name);
// =System.out.println(name + "살 " + name + "님");
}

public static void main(String[] args) {
  System.out.println("main()11111");

  //hello 메서드 호출하기
  hello("홍길동", 20);
  //hello 메서드 실행이 완료되면 다시 되돌아와서 다음 명령을 실행
System.out.println("main()22222");
//메서드는 언제든 필요할 때마다 반복하여 실행 가능
hello("ㅁㄴㅇ", 30);
System.out.println("main()33333");
//또 메서드 호출해보자
hello("ㅋㅌㅊ", 16);
System.out.println("main()44444");
}
}
//// 아규먼트
//  메서드를 호출할 때 넘겨주는 값
//  예) hello("홍길동", 20);
//  여기서 "홍길동", 20이 아규먼트임
//// 파라미터
//  아규먼트를 받는 변수
//  예) void hello(String name, int age) {...}
//  여기서 name과 age 변수가 파라미터임

