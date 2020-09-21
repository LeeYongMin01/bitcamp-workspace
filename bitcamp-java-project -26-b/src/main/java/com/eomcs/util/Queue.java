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
    // => MyQueue는 MyLinkedList를 상속 받았고,
    //    MyLinkedList의 경우 노드와 노드 사이를 연결해야 하기 때문에 
    //    단순히 'shallow copy'를 수행해서는 안된다.
    // => 다음과 같이 새 Queue를 만들고, 
    //    기존 Queue에 저장된 값을 꺼내서 새 Queue에 저장해야 한다.
    Queue<E> newQueue = new Queue<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      newQueue.offer((E) value);
    }
    return newQueue;
  }
  
  @Override
  public Iterator<E> iterator() {

   return new QueueIterator(); 
  }
  
  private class QueueIterator implements Iterator<E> {
    Queue<E> queue;
    
    public QueueIterator() {
      try {
        // 큐는 한 번 poll() 하면 데이터가 제거된다.
        // 따라서 복제본을 만들어 사용한다.
        this.queue = Queue.this.clone();
      } catch (Exception e) {
        // 큐를 복제할 때 오류가 발생한다면,
        // 이 메서드를 호출한 쪽에 실행 오류를 던진다.
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
  }
}
