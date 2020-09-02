// Object 클래스의 메서드를 오버라이딩 하기 - toString()
package com.eomcs.corelib.ex01;

public class Exam0122 extends Object {
  
  // 수퍼 클래스를 지정하지 않으면 기본으로 java.lang.Object 클래스가 
  // 수퍼 클래스로 지정된다.
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }
  }
  
  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 100, 100);
    
   String str = s1.toString();
    // toString()?
    // => Score 클래스의 수퍼 클래스인 Object의 메서드이다.
    // => 클래스를 정의할 때 수퍼 클래스를 지정하지 않으면 
    //    자동으로 java.lang.Object 클래스가 수퍼 클래스로 지정된다.
    // => 그래서 자바의 모든 클래스는 toString()을 호출할 수 있다.
    //    즉 자바의 모든 클래스는 Object 클래스에 정의된 메서드를 호출할 수 있다.
    
    System.out.println(str);
    
  }
}








