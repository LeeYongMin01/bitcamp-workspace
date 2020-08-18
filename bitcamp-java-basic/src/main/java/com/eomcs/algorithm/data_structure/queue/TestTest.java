package com.eomcs.algorithm.data_structure.queue;

public class TestTest {
  public static void main(String[] args) {
    Test test = new Test();
    test.offer("aaa");
    test.offer("bbb");
    test.offer("ccc");
    System.out.println(" ==> " + test.peek());
    test.offer("ddd");
    test.offer("eee");
    print(test);

    System.out.println(test.poll());
    System.out.println(test.poll());
    System.out.println(" ==> " + test.peek());
    System.out.println(test.poll());
    System.out.println(test.poll());
    System.out.println(test.poll());
    System.out.println(test.poll());
    System.out.println(test.poll());
  }
  static void print(Test test) {
    for (int i = 0; i < test.size(); i++) {
      System.out.println(test.get(i) + ",");
    }
    System.out.println();
  }
}
