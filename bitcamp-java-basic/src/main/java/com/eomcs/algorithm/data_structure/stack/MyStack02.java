package com.eomcs.algorithm.data_structure.stack;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// <스택>
// 마지막에 넣은 값이 첫번째로 나오는 Last In First Out(LIFO) 구조
// 출구가 하나기 때문에 가능
// 1) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속 받는다.
// 2) 스택에 값을 추가하는 push() 메서드를 정의한다.
public class MyStack02 extends MyLinkedList {

  public Object push(Object item) {
    add(0, item); // 0번째에 아이템을 쌓는다.
    return item; // add한 것을 그대로 넣음

  }
}
