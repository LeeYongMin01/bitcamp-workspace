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
    try {      
      return new StackIterator<E>(this.clone());
    } catch (Exception e) {
      throw new RuntimeException("스택 복제하는 중에 오류 발생!");
    }
  }
  
  private static class StackIterator<E> implements Iterator<E> {
    Stack<E> stack;
    
    public StackIterator(Stack<E> stack) {
      this.stack = stack;
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
