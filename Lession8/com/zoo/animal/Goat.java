package com.zoo.animal;

import com.zoo.Animal;

public class Goat extends Animal {

  public void say() {
    System.out.println(getName() + ": BAAA ");
  }

  public void run() {
    System.out.println(getName() + " - умеет бегать! ");
  }

  public void food() {
    System.out.println(getName() + " - травоядный(ая) ");
  }

}
