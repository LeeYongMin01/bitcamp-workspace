//변수 선언
// - 데이터를 저장할 메모리를 확보하는 명령
//

package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    int i;
    int i2;
    int i3;
    
    int x, y, z;
     
    i = 100;
    x = i;
    y = i * x;
    
    byte b1;
    byte b2;
    
    b1 = 10; // [00001010]
    b2 = 12; // [00001100]
    b1 = b2; // [00001100]
    
    i = b1; // 0 24개하고 b1의 값, 큰 메모리 = 작은 메모리면 남는 값들은 0으로 채워짐
    // 작은 메모리 = 큰 메모리는 작은 메모리에 큰 메모리를 넣을 수 없으니 오류
    
    b2 = (byte)i;
    
    int a = 100;
    int b = 200;
    
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10; // 00001010
    xx = 12; // 00001100
    xx = 78; // 01001110
    
  }
}
