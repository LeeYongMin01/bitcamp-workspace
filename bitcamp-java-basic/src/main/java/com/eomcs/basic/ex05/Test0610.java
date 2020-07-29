package com.eomcs.basic.ex05;


// 증감 연산자 : 후위(post-fix) 증가 연산자

public class Test0610 {
  public static void main(String[] args) {
    int i = 2;
    
    i++;
    // 증감 연산자가 없다면, 기존 변수의 값을 1 증가시키기 위해
    // 매번 i = i + 1; 로 코딩해야하는 번거로움이 있다.
    
    i++; // i => 3
    // 현재 위치에 i 메모리에 들어있는 값을 꺼내 놓은 후에
    // i 메모리의 값을 1 증가시킨다.
    
    i++; // i => 4
    
    System.out.println(i);
    
    System.out.println(i++);
    
    //System.out.println(4);
    // i = i + 1; ==> 5
    System.out.println(i);
    
    
  }
}
