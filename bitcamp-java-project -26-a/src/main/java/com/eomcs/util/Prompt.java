package com.eomcs.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {

  static Scanner scanner = new Scanner(System.in);

  //다른 패키지에서 메서드를 호출할 수 있도록 사용 범위를 public 으로 공개한다.
  public static String inputString(String title) {
    System.out.print(title);
    return scanner.nextLine();
  }
  
  public static int inputInt(String title) {
    return Integer.parseInt(inputString(title));
  }
  
  public static Date inputDate(String title) {
    return Date.valueOf(inputString(title));
  }
  
 public static void close() {
    scanner.close();
  }
}
