package com.eomcs.basic.ex04;

//# 형변환 - 명시적 형변환
public class Exam0930 {
  public static void main(String[] args) {
    
    // 부동소수점 메모리의 값을 정수 메모리에 저장할 때
    // 값이 잘릴 수 있음을 알면서도 정수 메모리에 저장해야 할 때가 있음
    // 또는 큰 메모리의 값을 작은 메모리에 저장해야할 때가 있음
    
   // ==> 컴파일러에게 강제로 값을 넣을 것을 명시 = 명시적 형변환 
    
    
    //float ==> int // 원래는 실수 ==> 정수라서 안됨
    float f = 3.14f;
    int i = (int)f; // 소수점 이하가 제거됨
    System.out.println(i);
    
    
        
  }
}
