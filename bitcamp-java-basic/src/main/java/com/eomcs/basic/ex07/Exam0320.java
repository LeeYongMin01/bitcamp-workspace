package com.eomcs.basic.ex07;

// # 메서드 : call by reference
//
public class Exam0320 {

  static void swap(int[] arr) {
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }

  public static void main(String[] args) {
    int[] arr = new int[] {100, 200};
    swap(arr); // 배열 인스턴스(메모리)값을 넘기는 것이 아니라
    // 주소만을 넘기는 것. 그래서 call by reference라 부름
    System.out.printf("main(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);




  }




}
