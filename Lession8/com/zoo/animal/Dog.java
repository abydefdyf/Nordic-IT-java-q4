package com.zoo.animal;

import com.zoo.Animal;

public class Dog extends Animal {

  public void say() {
    System.out.println(getName() + ": WOOF ");
  }

  public void run() {
    System.out.println(getName() + " - умеет бегать! ");
  }

  public void food() {
    System.out.println(getName() + " - плотоядный(ая) ");
  }

}
