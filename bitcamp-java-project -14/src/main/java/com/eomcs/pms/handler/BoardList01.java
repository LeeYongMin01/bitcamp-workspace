package com.eomcs.pms.handler;

import java.util.Date;

public class BoardList01 {
  
  static class Board {
    // 게시물 데이터
    int no;
    String title;
    String content;
    String writer;
    Date registeredDate;
    int viewCount;
  }
  static final int DEFAULT_CAPACITY = 100;
  Board[] list; 
  int size = 0;
  
  public BoardList01() {
    list = new Board[DEFAULT_CAPACITY];
  }
  
  public BoardList01(int initialCapacity) {
    if (initialCapacity <= DEFAULT_CAPACITY) {
      list = new Board[DEFAULT_CAPACITY];
    } else {
      list = new Board[initialCapacity];
    }
  }
  
  public void add(Board board) {
    list[size++] = board;
  }
  
  public Board[] toArray() {
    Board[] arr = new Board[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
