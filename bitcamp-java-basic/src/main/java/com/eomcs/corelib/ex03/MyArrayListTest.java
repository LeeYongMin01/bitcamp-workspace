package com.eomcs.corelib.ex03;

public class MyArrayListTest {
public static void main(String[] args) {
  MyArrayList.add("aaa"); // aaa
  MyArrayList.add("bbb"); // bbb
  MyArrayList.add("ccc"); // ccc

  print();

  MyArrayList.add(1, "xxx"); // aaa, xxx, bbb, ccc
  print();



  Object old = MyArrayList.set(2, "yyy"); // aaa, xxx ,yyy, ccc
    print();
    System.out.println(old); // 교체하기 전 값 bbb

    old = MyArrayList.remove(1);
    print();
    System.out.println(old);
  }

 static void print() {
   for(int i = 0; i < MyArrayList.size; i++) {
     String str = (String) MyArrayList.get(i);
     System.out.print(str + ",");
   }
   System.out.println();
}
}