package com.eomcs.basic.ex04;

// # 배열 - 배열이 필요할 때 : 같은 종류의 메모리를 많이 다룰 경우

public class Exam0521 {
  public static void main(String[] args) {
   
    int a1, a2, a3, a4, a5;
    
    a1 = 100;
    a2 = 90;
    a3 = 80;
    a4 = 70;
    a5 = 60;
   
    // 변수에 들어 있는 값의 합계를 구해보자
    
    int sum1 = a1 + a2 + a3 + a4 + a5;
    
    int[] arr1;
    arr1 = new int[5];
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
    
    // 배열 변수에 들어있는 값의 합계를 구해보자
    int sum2 = 0;
    for (int item : arr1) {
      sum2 = sum2 + item;
    }
    System.out.println(sum2);
    
  }
}
