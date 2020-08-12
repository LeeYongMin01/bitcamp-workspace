package com.eomcs.oop.ex06.c;

public class C2 extends C {

  // 다음은 C의 메서드를 오버라이딩 한 것이 아니다
  // 왜? C의 m1()은 private이기 때문에 오직 C 에서만 사용할 수 있다.
  // C2에서 접근 불가

  //@Override를 없애니 m1()이 정의된다?
  // => 오버라이딩이 아니라 C2에 새로 메서드가 추가된 것
  // => 오버라이딩은 @Override 애노테이션을 사용했을 때 오류가 없어야함

  private void m1() {}
  // 결론) 접근 권한 없는 메서드는 오버라이딩이 불가능

// 다음은 전형적인 오버라이딩의 예다.
  @Override void m2() {} //가능
  @Override protected void m3() {} // 가능
  @Override public void m4() {} // 가능
}

//멤버의 접근 범위
//private      : 같은 클래스
//(default)    : 같은 클래스 + 같은 패키지
//protected    : 같은 클래스 + 같은 패키지 + 서브 클래스
//public       : 모두

















}







