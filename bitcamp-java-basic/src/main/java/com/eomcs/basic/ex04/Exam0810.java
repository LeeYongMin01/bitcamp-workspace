// 로컬 변수 선언

package com.eomcs.basic.ex04;

public class Exam0810  // 클래스 선언
{ // 클래스 블록 => 클래스 정의
  
  static int x;
  
}
  public static void main(String[] args) // 메서드 선언
  { // 메서드 블록 => 메서드 정의
    
    int a;
    int x; // 같은 블록의 로컬 변수가 아니라면 같은 이름으로 변수를 선언할 수 있다.
    
    // int a; // 같은 블록에 이름이 같은 변수를 중복 선언할 수 없다.
    // 컴파일 오류 => 문법 오류
  }
    { // 로컬 블록 
      //int a; // 바깥 블록에 선언된 변수와 같은 이름을 가질 수 없다.
      int b;
      }
    {
      //int b; //바깥 블록에 선언된 변수와 같은 이름의 변수를 선언할 수 없다.
      //int a; // 컴파일 오류
      int c;
      int d;
      // 블록 안에 선언된 변수는 블록을 나가는 순간 자동 삭제된다.
    }
    
    //c = 100; // 컴파일 오류
    // => 블록 안에 선언된 변수는 위에서 선언한 하위 블록의 c 변수와 다르다.
    b = 100; // OK
    
    
    int c; // 이 c 변수는 위에서 선언한 하위 블록의 c 변수와 다르다.
    
    {
      int d; // 이전 블록에서 만든 d 변수는 이미 삭제되었기 때문에 
      //이 블록에서 같은 이름으로 변수를 만들 수 있다.
    }
    
    b = 100;
    c = 200;
    //d = 300; // 컴파일 오류
    a = 300;
    
    
    }

    int i;
    for (i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println(i);

    for (int k = 0; k < 10; k++) {
      System.out.println(k);
    }
    //System.out.println(k);
  
    
    int m;
    int age = 20;
    if (age > 19) {
      m = 200;
      int n = 300;
    }  
      System.out.println(m);
      //System.out.println(n); // 컴파일 오류
      
    }
} 