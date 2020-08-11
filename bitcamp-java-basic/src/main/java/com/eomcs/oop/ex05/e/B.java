package com.eomcs.oop.ex05.e;

  // 상속
  // => 재사용할 기존 클래스를 지정
  // => 새 클래스에는 추가할 기능을 덧붙인다.

  // 주의!
  // B클래스는 A클래스의 링크 정보만 가지고 있을 뿐 코드를 주지 않는다.
  // 또한 B클래스를 사용하려면 반드시 A클래스가 있어야 한다.

  public class B extends A {
    int v2;

    static {
      System.out.println("B 클래스의 static{} 실행!");
  }
}
