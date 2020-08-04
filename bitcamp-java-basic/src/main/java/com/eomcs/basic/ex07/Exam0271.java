package com.eomcs.basic.ex07;

//# 메서드 : 가변 파라미터의 단점

public class Exam0271 {

  static void m2(int a, String... names) {} // 가능

  // 배열 파라미터는 여러 개 선언 가능
static void x1(String[] namex, String[] emails) {}

// 배열 파라미터는 순서 상관이 없음
static void x2(String[] names, int a) {}

public static void main(String[] args) {
  // 컴파일 확인

}
}

// 결론
// 메서드에 가변 파라미터는 한 개만 사용 가능
// 가변 파라미터는 반드시 맨 뒤에 와야함
// 복잡한 사용을 방지하기 위해

