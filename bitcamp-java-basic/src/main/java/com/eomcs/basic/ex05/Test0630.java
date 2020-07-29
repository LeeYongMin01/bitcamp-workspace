package com.eomcs.basic.ex05;

// 증감 연산자 : 후위(post-fix) 증감 연산자 응용

public class Test0630 {
  public static void main(String[] args) {
    int i = 7;
    
    int j = i++;
    
    // 1) j = 7; => 7 값을 = 연산자 오른쪽의 식이 수행되기 전까지 저장할 수 없다.
    // 2) 즉, i = i + 1 실행 => i = 8 
    // 3) 할당 연산자 실행 => j = 7 실행
    
    System.out.println(j);
    System.out.println(i);
    
    
    
    
  }
}
