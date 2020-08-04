// call by value vs call by reference

package com.eomcs.basic.ex07;

public class Exam0310_class {

    static class Person {
      String name;
      int age;
      boolean working;

    }


    public static void main(String[] args) {






    int a = 200;

    m1(a); // call by value

    System.out.println(a); //200

    a = 300;

    m1(a);

    System.out.println(a); //300

    //자바에서는 &을 사용하여 주소값을 넘길 수 없기 때문에
    // 배열을 사용
    int[] arr = new int[3]; // new 명령으로 선언되는 모든 변수는 Heap이라고 하는
                            // 곳에 따로 만들어짐
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;

    m2(arr); // call by reference

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println("------------------------------------");

    Person p; // 주소를 저장할 변수
    p = new Person();

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
    // p의 주소로 찾아가서 변수의 값을 출력하자라는 뜻
    m3(p); // call by reference
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
  }

    static void m3(Person p) {
      p.name = "홍길동";
      p.age = 20;
      p.working = true;

    }

  static void m1(int a) {
    a = 100;

  }
  static void m2(int[] arr) {
  arr[0] *= 2;
  arr[1] *= 3;
  arr[2] *= 4;


  }

}



