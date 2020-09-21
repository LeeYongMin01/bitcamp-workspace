package com.eomcs.util;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<E> extends LinkedList<E> {

  public E push(E item) {
    add(item);
    return item;
  }

  public E pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public E peek() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }

  public boolean empty() {
    return size() == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone() throws CloneNotSupportedException {
    Stack<E> newStack = new Stack<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      newStack.push((E) value);
    }
    return newStack;
  }
  
  @Override
  public Iterator<E> iterator() {
    // StackIterator의 생성자에서 clone()에서 발생한 예외를 처리하도록 프로그래밍 했기 때문에
    // 여기서는 할 필요가 없다.
    return new StackIterator();
  }
  
  private class StackIterator implements Iterator<E> {
    Stack<E> stack;
    
    public StackIterator() {
      try {
        // 스택은 한 번 pop() 하면 데이터가 제거된다.
        // 따라서, 복제본을 만들어 사용한다.
        this.stack = Stack.this.clone();
      } catch (Exception e) {
        // 스택을 복제할 때 오류가 발생한다면,
        // 이 메서드를 호출한 쪽에 실행 오류를 던진다.
        throw new RuntimeException("큐를 복제하는 중에 오류 발생!");
      }
    }
    
    @Override
    public boolean hasNext() {
      return !stack.empty();
    }
    
    @Override
    public E next() {
      if(stack.empty())
        throw new NoSuchElementException();
      return stack.pop();
    }
  }
}
