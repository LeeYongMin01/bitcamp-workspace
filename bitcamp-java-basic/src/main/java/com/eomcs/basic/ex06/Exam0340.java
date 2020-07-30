package com.eomcs.basic.ex06;

//# 흐름 제어문 - do ~ while 반복문

public class Exam0340 {
  public static void main(String[] args) {
    int i = 0;

    // 1~10까지 출력
    do
      System.out.println(++i);
    while (i < 10);
    System.out.println("----------------------");

    // 여러개의 문장을 반복할 때는 블록 사용

    i = 0;
    do {
      i += 1;
      System.out.println(i);
    } while (i < 10);
  }
}
/*
do ~ while
최소 한번은 반복
한번 이상 반복하면 do ~while
0번 이상 반복하면 while

do
문장1;
while(조건);

do {
문장1;
문장2;
문장3;
} while(조건);
*/
