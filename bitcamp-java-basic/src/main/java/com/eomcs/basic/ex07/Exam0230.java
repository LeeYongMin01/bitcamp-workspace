package com.eomcs.basic.ex07;

// # 메서드 : 개념 및 기본 문법 3

public class Exam0230 {

//  3) 메서드 : 리턴값(o), 파라미터(x)
//=> 메서드 블록을 실행한 후 값을 리턴하는 메서드
//메서드 정의할 때 어떤 값을 리턴하는 지 그 타입을 적어야함
//메서드에서도 종료하기 전에 반드시 그 타입의 값을 리턴해야함
//=> 리턴 타입은 반드시 한 개만 가능
//만약 여러개의 값을 리턴하고 싶다면, 배열과 객체를 이용

static String hello() {
//  값을 리턴하는 문법
//  return 값;
  return "안녕!"; // 리턴 명령을 실행하면 메서드 실행을 종료
// 메서드를 리턴한 후에 작업을 수행할 수 없음
// int a; // 오류
//  System.out.println("no");//오류
}

public static void main(String[] args) {

//  hello() 메서드를 실행하고, 그 리턴 값을 변수에 담는다
//  => 리턴 값을 받을 변수 준비
//  => 변수에 리턴 값을 받음
//  => 리턴 값과 변수의 타입이 같아야함
  String r = hello();
  System.out.println(r);

//  메서드가 값을 리턴한다고 해서 반드시 그 값을 변수에 담아야 하는 것은 아님
//  변수에 받을 여부는 호출하는 쪽에서 결정
  hello(); // 값을 받는 변수가 없으면 리턴 값은 버려짐
//  리턴 타입과 다른 타입의 변수로 값을 받으려 하면 오류
//  int r2 = hello();// 오류
  }
}
