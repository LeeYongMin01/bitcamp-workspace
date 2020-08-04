package com.eomcs.basic.ex07;

// # 메서드 : 가변 파라미터의 단점

public class Exam0270 {

//1) ********가변 파라미터는 여러개 선언할 수 없다******
//=> ******아규먼트의 시작과 끝을 구분할 수 없다.****
//예) m1("aaa", "bbb", "aaa@test.com", "bbb@test.com");
//어느 값이 names 배열에 들어가고, 어느 값이 emails 배열에 들어가는가?
//=> 이런것을 알 수 없다. 어떤 값이 어떤 배열에 들어가는지.
//static void m1(String...names, String...emails) {} // 오류
//
//=> 중간에 다른 타입이 온다 하더라도 안된다
//static void m1(String... names, int a, String... emails) {} // 오류

//위의 메서드는 값을 구분할 수 있을 것 같은데?
// => 그냥 다음과 같이 호출하면 되는 것 아닌가?
// 예) m1("aaa", "bbb", 100, "ccc", "ddd", "eee");
// => 사람들은 쉽게 구분할 수 있다.
// => 컴파일러가 상황 구분이 힘들어짐

//  2) 가변 파라미터는 반드시 맨 끝에 와야함
//=> 아규먼트의 시작과 끝을 구분할 수 없다.
//예) m2("aaaa");
//static void m2(String... names, String a) {} // 오류
//static void m2(String... names, int a) {} // 오류
  static void m2(int a, String... names) {} // OK!

  public static void main(String[] args) {
    // 컴파일 확인하라!
  }
}

// 결론!
// - 메서드에 가변 파라미터는 한 개만 사용할 수 있다.
// - 가변 파라미터는 반드시 맨 뒤에 와야 한다.
// - 그 이유는 복잡한 사용을 막기 위해!















