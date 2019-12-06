package com.example;

import java.util.concurrent.LinkedBlockingDeque;

public class NextGenerationUpdate implements Runnable {
  private LinkedBlockingDeque<Integer> visitors;
  private LinkedBlockingDeque<Integer> vector;


  public NextGenerationUpdate(LinkedBlockingDeque<Integer> visitors,
      LinkedBlockingDeque<Integer> vector) {
    super();
    this.visitors = visitors;
    this.vector = vector;
  }


  @Override
  public void run() {
    while (moveElement()) {
      if (Thread.interrupted()) {
        
      }
    }
  }


  private boolean moveElement() {
    var element = visitors.pollFirst();
    
    if (element != null) {
      vector.add(element);
      return true;
    } else {
      return false;
    }

  }

}
