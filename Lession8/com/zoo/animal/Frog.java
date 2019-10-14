package com.zoo.animal;

import com.zoo.Animal;

public class Frog extends Animal {

  public void say() {
    System.out.println(getName() + ": KWAAAAA ");
  }

  public void run() {
    System.out.println(getName() + " - бегать не умеет :(");
  }

  public void food() {
    System.out.println(getName() + " - плотоядный(ая) ");
  }


}
