package com.eomcs.design_pattern.observer.test;

public class SunRoofCarObserver extends AbstractCarObserver {
  
  @Override
  public void carStopped() {
    System.out.println("선루프 닫기");
    
  }

  

}
