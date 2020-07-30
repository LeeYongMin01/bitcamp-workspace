package com.eomcs.basic.ex06;

//# 흐름 제어문 - else 문의 소속

public class Exam0150 {
  public static void main(String[] args) {
    int age = 15;

    // else는 가장 가까운 if에 소속된다.
    // 들여쓰기에 속지 말라!

    if (age >= 19)
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    else
      System.out.println("미성년입니다.");

    System.out.println("------------------------------");

    // 질문) if문에 블록을 사용하지 않으면 한개의 문장만 올 수 있다고 했는데,
    // 위의 문장은 두개의 문장이므로 오류가 발생해야 하는 것 아닌가?
    // 답변) else문은 if 없이 단독으로 사용 불가능하기 때문에 if ~ else는 한 문장으로 취급됨
    // 따라서, 위의 if (age >= 70) ~ else ~ 는 한 문장으로 간주되기 때문에 중괄호를 사용할 필요X

    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");
    }

    System.out.println("------------------------------");


    // 만약 else문을 첫번째 if 문에 소속되게 하고 싶다면
    // 두번째 if문을 블록으로 묶어라
    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    }
    else // 두 번째 if는 첫 번째 if 블록에 묶여있기 때문에 이 else와 상관없다.
      System.out.println("미성년입니다.");



  }
}
