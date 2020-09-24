// Character Stream - 읽은 데이터를 문자 배열의 특정 위치에 저장하기
package com.eomcs.io.ex03;

import java.io.FileReader;

public class Exam0320 {

  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("temp/test2.txt");
    
    char[] buf = new char[100];
    
    // read(버퍼의 주소, 저장할 위치, 읽을 바이트 개수)
    // => 리턴 값은 실제 읽은 문자의 개수이다.
    int count = in.read(buf, 10, 40); // 40개 문자를 10번 배열부터 저장
    
    in.close();
    
    System.out.printf("%d\n", count);
    
    for (int i = 0; i < 20; i++)
      System.out.printf("%c(%x) ", buf[i], (int) buf[i]);
    
    System.out.println();
  }
}
