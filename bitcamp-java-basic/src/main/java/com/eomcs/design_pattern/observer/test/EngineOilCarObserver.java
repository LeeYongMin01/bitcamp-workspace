package com.eomcs.design_pattern.observer.test;

public class EngineOilCarObserver extends AbstractCarObserver {
  
  @Override
  public void carStarted() {
    System.out.println("엔진오일 검사");
  }
}
