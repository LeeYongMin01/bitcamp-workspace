package com.eomcs.design_pattern.flyweight.after;

import java.util.Scanner;

public class BrushTest {

  public static void main(String[] args) {
    BrushPool brushPool = new BrushPool();
    Scanner keyboard = new Scanner(System.in);

    while(true) {
      System.out.print("패턴? ");
      String pattern = keyboard.nextLine();

      System.out.print("선 길이? ");
      int length = Integer.parseInt(keyboard.nextLine());
      if (length < 0)
        break;

      // 사용자가 입력한 패턴의 브러쉬 객체를 생성한다.
      // - 매번 생성하지 않기 때문에 가비지 생성이 줄어든다.
      // - 가비지가 계속 생성되는 문제가 있다.
      // - 해결책? 생성한 객체를 보관하여 재사용하면 된다.

      Brush brush = brushPool.getBrush(pattern);
      brush.draw(length);
    }

    keyboard.close();
  }
}