package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class MyArrayListTest4 {

public static void main(String[] args) {
  ArrayList list1 = new ArrayList(100);

  list1.add("aaa");
  list1.add("bbb");
  list1.add("ccc");
  list1.add("ddd");
  list1.add("eee");
  list1.add("fff");
  list1.add("ggg");

  print(list1);

  // 목록을 따로 관리하고 싶을 때
  ArrayList list2 = new ArrayList();
  list2.add("fff");
  list2.add("ggg");
  list2.add("hhh");
  list2.add("iii");
  list2.add("jjj");
  list2.add("kkk");
  list2.add("lll");

  print(list2);

  System.out.println("--------------------------------------------------------");


}

 static void print(ArrayList list) {
   for(int i = 0; i < list.size(); i++) {
     String str = (String) list.get(i);
     System.out.print(str + ",");
   }
   System.out.println();
}
}