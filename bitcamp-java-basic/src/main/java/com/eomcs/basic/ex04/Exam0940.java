package com.eomcs.basic.ex04;

//# 형변환 - 명시적 형변환 : 큰 정수 변수 값을 작은 정수 변수에 저장


public class Exam0940 {
  public static void main(String[] args) {
    
    byte b = 100;
    short s = 100;
    int i = 100;
    long l = 100;
    
    // 1) 큰 메모리의 값이 작은 메모리에 충분히 들어가는 경우
    // short ==> byte
    byte b2 = (byte)s; // 명시적 형변환
    System.out.println(b2);
    
    // int ==> byte
    b2 = (byte)i; // 명시적 형변환
    System.out.println(b2);
    
    // long ==> byte
    b2 = (byte)l; // 명시적 형변환
    System.out.println(b2); 
    
    // 2) 큰 메모리의 값이 작은 메모리에 들어갈 수 없는 경우
    // => 앞 쪽 바이트의 값이 잘려서 들어간다.
    int i2 = 0b0000_0000_0000_0000_0000_0001_0010_1100; // = 300(10진수)
    b2 = (byte) i2; 
    System.out.println(b2);
    
    
    l = 400_0000_0000L; // 0x00_00_00_09_50_2f_90_00
    i = (int)l; // 큰 메모리의 값이 작은 메모리에 들어가지 못하는 경우
    System.out.println(l); // 앞 쪽 바이트가 짤린다.
    System.out.println(0x502f9000);
    
  }
}
