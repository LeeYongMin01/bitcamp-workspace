package com.eomcs.basic.ex07;

import java.util.Scanner;

// # 메서드 : 사용 후
//
public class Exam0120 {

  // 스페이스를 출력하는 코드들을 관리하기 쉽게 별도의 블록에 모아 놓는다.
  // 그 블록에 대해 이름을 붙인다.
  // => 이렇게 정의한 블록을 "메서드" 또는 "함수"라고 부른다.
  // => 자바는 "메서드" 이름을 주로 사용
  public static void printSpaces(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print(" ");
    }
  }

  // '*'' 문자를 출력하는 코드를 관리하기 쉽게 별도의 블록으로 빼둔다.
  // 그 블록의 이름을 붙인다.
  // 별도로 빼둔 코드 블록에 이름을 붙인 것을 메서드=함수 라고 부름

  public static void printStars(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print("*");
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = scan.nextInt();

    for (int starLen = 1; starLen <= len; starLen += 2) {
      // 명령 코드들을 기능별로 묶어 놓고 필요할 때마다
      // 다음과 같이 사용하면 코드의 가독성이 향상된다.
      printSpaces((len-starLen) / 2);
      printStars(starLen);
      System.out.println();
    }
    scan.close();
  }
}




















