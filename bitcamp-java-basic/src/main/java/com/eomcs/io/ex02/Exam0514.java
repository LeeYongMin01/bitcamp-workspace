// Byte Stream - 텍스트 출력 하기
package com.eomcs.io.ex02;

import java.io.FileOutputStream;

public class Exam0514 {

  public static void main(String[] args) throws Exception {
    
    String str = new String("AB가각");
    
    System.out.printf("file.encoding=%s\n", System.getProperty("file.encoding"));
    byte[] bytes = str.getBytes("UTF-8");
    
    for(byte b : bytes) {
      System.out.printf("%x ", b);
    }
    
    FileOutputStream out = new FileOutputStream("temp/utf8.txt");
    out.write(bytes);
    out.close();
    System.out.println("데이터 출력 완료!");
  }
}

