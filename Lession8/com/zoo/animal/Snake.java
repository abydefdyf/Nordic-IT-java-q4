package com.zoo.animal;

import com.zoo.Animal;

public class Snake extends Animal {

  public void say() {
    System.out.println(getName() + ": SHHHHH");
  }

  public void run() {
    System.out.println(getName() + " - Бегать не умеет :(");
  }

  public void food() {
    System.out.println(getName() + " - плотоядный(ая) ");
  }

}
