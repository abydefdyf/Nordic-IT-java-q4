package com.zoo.animal;

import com.zoo.Animal;

public class Parrot extends Animal {

  public void say() {
    System.out.println(getName() + ": CHIRP");
  }

  public void run() {
    System.out.println(getName() + " - Бегать не умеет :(");
  }

  public void food() {
    System.out.println(getName() + " - травоядный(ая) ");
  }


}
