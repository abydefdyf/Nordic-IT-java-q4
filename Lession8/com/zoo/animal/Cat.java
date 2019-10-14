package com.zoo.animal;

import com.zoo.Animal;

public class Cat extends Animal {

  public void say() {
    System.out.println(getName() + ": MEOW");
  }

  public void run() {
    System.out.println(getName() + " - умеет бегать! ");
  }

  public void food() {
    System.out.println(getName() + " - плотоядный(ая) ");
  }


}
