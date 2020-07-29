package com.eomcs.basic.ex05;


// 조건 연산자 => ? :

public class Test0510 {
  public static void main(String[] args) {
    // 조건 연산자
    // 조건 ? 표현식1 : 표현식2
    // 조건이 참이면 표현식1을, 거짓이면 표현식2를 실행
    
    int age = 12;
    
    /*
    (age > 18) ? System.out.println("성인이다.") : 
                     System.out.println("미성년자이다.");  //컴파일 오류!
    */
    
    // 표현식 자리에는 실행 결과가 놓여져야 하는데 System.out.println("성인이다.")
    // 문장은 결과를 출력하기만할 뿐 리턴하지 않기 때문에 컴파일 오류.
    
    String message = (age > 18) ? "성년" : "미성년";
    System.out.printf("나이 %d는(은) %s이다.\n", age, message);
  }
  
}
