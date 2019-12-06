package com.example;

import java.util.Vector;

public class NextGeneration implements Runnable {
  private Vector<Integer> visitors;
  private Vector<Integer> vector;


  public NextGeneration(Vector<Integer> visitors, Vector<Integer> vector) {
    super();
    this.visitors = visitors;
    this.vector = vector;
  }


  @Override
  public void run() {
    while (moveElement()) {
      //
    }

  }

  private boolean moveElement() {
    Integer element = 0;
    synchronized (NextGeneration.class) {
      if (visitors.isEmpty()) {
        return false;
      } else {
        element = visitors.remove(0);
      }
    }
    vector.add(element);
    return true;
  }

}
