package com.eomcs.util;

import java.util.NoSuchElementException;

public abstract class AbstractList<E> implements List<E> {
  
  protected int size;
  
  @Override
  public int size() {
    return size;
  }
  
  // 인터페이스 새로 추가된 규칙, `Iterator` 구현체를 리턴하는 메서드를 정의한다.
  @Override
  public Iterator<E> iterator() {

    // 익명 클래스는 이름이 없기 때문에 
    // 클래스를 정의하자마자 바로 인스턴스를 생성해야 한다.
    return new Iterator<E>() {
      int cursor;
   
      @Override
      public boolean hasNext() {
        return cursor < AbstractList.this.size();
      }
      
      @Override
      public E next() {
        if(cursor == /*AbstractList.this.*/size())
          throw new NoSuchElementException();
        
        return get(cursor++);
      }
    };
 }
}
