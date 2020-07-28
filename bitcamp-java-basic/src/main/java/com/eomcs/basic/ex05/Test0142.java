package com.eomcs.basic.ex05;

//# 산술 연산자 : 연산의 결과 타입
public class Test0142 {
  public static void main(String[] args) {
    
    // int와 int의 연산 결과는 int
    // 다른 타입이 될 수 없음
    
    int x = Integer.MAX_VALUE; // 0x7fffffff = 약 +21억
    int y = Integer.MAX_VALUE; // 0x7fffffff = 약 +21억
    
    int r1 = x + y; // 0x7fffffff + 0x7fffffff = 0xfffffffe = -2
    
    System.out.println(r1); // int(4byte) + int(4byte) = int(4byte)이지만,
    //=> int와 int의 연산 결과가 int의 범위를 넘어가면 의도한 값이 나오지 않을 수 있음
    
    // 그렇다면 int와 int의 연산 결과를 더 큰 메모리에 담는다면 해결될까?
    long r2 = x + y; //0x7fffffff + 0x7fffffff = 0xfffffffe = -2
    System.out.println(r2); 
    // 해결 안됨
    // 이유
    // int와 int의 연산 결과는 피연산자와 같은 4바이트 int가 됨
    // 그래서 8바이트 long 변수에 저장되기 전에 이미 결과가 int 값으로 -2로 굳혀지고
    // long 변수의 값에 할당되는 식이기 때문에 long 변수의 값은 -2가 된다.
    
    // 해결방법)
    // int와 int 연산 결과가 int 크기를 넘어갈 것 같으면
    // 형변환을 하라
    r2 = (long)x + (long)y;
    System.out.println(r2);
  }
}
