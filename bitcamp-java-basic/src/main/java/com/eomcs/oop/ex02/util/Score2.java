package com.eomcs.oop.ex02.util;

 public class Score2 { //static을 떼는 이유 : 클래스를 독립시키면
   // **문법적으로** static을 떼어야함

    public String name;
    public int kor;
    public int eng;
    public int math;
    public int sum;
    public float aver;

    public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f; // this는 로컬 변수
    }

    public void init(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }
 }

