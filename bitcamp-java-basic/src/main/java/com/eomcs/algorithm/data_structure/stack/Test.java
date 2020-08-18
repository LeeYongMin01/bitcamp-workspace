package com.eomcs.algorithm.data_structure.stack;

public class Test {
  public static void main(String[] args) {
    TestStack stack = new TestStack();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("aaa");
    System.out.println(" ==> " + stack.peek());
    stack.push("ddd");
    stack.push("eee");

    print(stack);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(" => " + stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
static void print(TestStack stack) {
  for (int i = 0; i < stack.size(); i++) {
    System.out.print(stack.get(i) + ",");
  }
  System.out.println();
  }
}
