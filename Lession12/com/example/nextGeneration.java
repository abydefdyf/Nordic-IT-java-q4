package com.example;

import java.util.Vector;

public class nextGeneration implements Runnable {
  private Vector<Integer> visitors;
  private Vector<Integer> vector;


  public nextGeneration(Vector<Integer> visitors, Vector<Integer> vector) {
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
    synchronized (nextGeneration.class) {
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
