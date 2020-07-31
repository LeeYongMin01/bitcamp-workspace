package com.eomcs.basic.ex06;

//# 흐름 제어문 - for(:) 와 배열

public class Exam0450 {
  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

    // 배열의 처음부터 끝까지 값을 꺼내는 것이라면
    // 다음의 for 문법을 사용
    // for (배열에서 꺼낸 값을 저장할 변수 선언 : 배열주소) 문장;
    for(String name : names)
      System.out.println(name);

  }
}

// for (:)
// 배열 전체를 반복하거나 컬렉션 객체 전체를 반복할 때 유용
// 배열의 일부만 반복할 수 없음
// 배열의 값을 다룰 때 인덱스(갯수)를 사용할 필요가 없어 편리

// 문법 :
// for (변수 선언 : 배열, Iterable 구현체) 문장1;
// 반복문을 돌 때 마다 값을 꺼내 변수에 담는다.



