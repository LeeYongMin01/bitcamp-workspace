package com.eomcs.basic.ex05;

// 증감 연산자 : 후위(post-fix) 증감 연산자 응용 I

public class Test0631 {
  public static void main(String[] args) {
    int i = 7;
    
    i = i++;
    
    // 1) i값을 놓는다 => i = 7 => = 오른쪽 식이 수행되기 전까지 왼쪽 i에 7값 할당 불가
    // 2) ++ 연산 실행 => i = 8 
    // 3) 할당 연산자 실행 -> i = 7 실행 => i는 8에서 7로 바뀜
    
    System.out.println(i);
  }
}
