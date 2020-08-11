package com.eomcs.oop.ex05.b;

// 상속 - 상속하지 않고 기능 추가 1

public class Exam01 {
  public static void main(String[] args) {
    // 새 프로젝트에서는 제조사, 모델명, 수용인원외에
    // 썬루프 장착여부, 자동변속 여부를 추가적으로 저장하고 싶다
    // = 기능추가

    // 방법1) 기존의 Car 클래스를 변경한다
    // 문제점:
    // 기존 소스를 변경하면 기존의 Car를 사용하여 만든 프로그램도 영향을 받는다.
    // => 심각한 오류가 발생할 수 있음

    Car c1 = new Car("비트자동차", "티코", 5, true, true);
  }

}
