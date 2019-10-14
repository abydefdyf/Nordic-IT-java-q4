package com.zoo;

public abstract class Animal {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void say();


  public void breatheAir() {
    System.out.println(getName() + " - дышет воздухом");
  }

  public abstract void run();


  public void eat() {
    System.out.println(getName() + " - нуждается в пищи");
  }

  public abstract void food();


}
