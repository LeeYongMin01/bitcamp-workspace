package com.eomcs.util;

import java.util.NoSuchElementException;

public class Queue<E> extends LinkedList<E> {

  public boolean offer(E e) {
    return add(e);
  }

  public E poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }

  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> newQueue = new Queue<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      newQueue.offer((E) value);
    }
    return newQueue;
  }
  
  @Override
  public Iterator<E> iterator() {

    return new Iterator<E>() {
    Queue<E> queue;

    {
      try {
        this.queue = Queue.this.clone();
      } catch (Exception e) {
        throw new RuntimeException("큐를 복제하는 중에 오류 발생!");
      }
    }
    
    @Override
    public boolean hasNext() {
      return queue.size() > 0;
    }
    
    @Override
    public E next() {
      if(queue.size() == 0)
        throw new NoSuchElementException();
      return queue.poll();
    }
  };
  }
}

