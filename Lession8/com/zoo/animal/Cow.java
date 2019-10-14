package com.zoo.animal;

import com.zoo.Animal;

public class Cow extends Animal {

  public void say() {
    System.out.println(getName() + ": MOOOO");
  }

  public void run() {
    System.out.println(getName() + " - умеет бегать! ");
  }

  public void food() {
    System.out.println(getName() + " - травоядный(ая) ");
  }

}
