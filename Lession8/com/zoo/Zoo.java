package com.zoo;

import com.zoo.animal.*;

public class Zoo {

  public static void main(String[] args) {

    var cat = new Cat();
    cat.setName("Myrka");
    System.out.println(cat.getName());
    cat.say();
    cat.breatheAir();
    cat.run();
    cat.eat();
    cat.food();


    var cow = new Cow();
    cow.setName("Byrenka");
    System.out.println(cow.getName());
    cow.say();
    cow.breatheAir();
    cow.run();
    cow.eat();
    cow.food();


    var dog = new Dog();
    dog.setName("Bobik");
    System.out.println(dog.getName());
    dog.say();
    dog.breatheAir();
    dog.run();
    dog.eat();
    dog.food();


    var goat = new Goat();
    goat.setName("Travka");
    System.out.println(goat.getName());
    goat.say();
    goat.breatheAir();
    goat.run();
    goat.eat();
    goat.food();


    var frog = new Frog();
    frog.setName("Pepe");
    System.out.println(frog.getName());
    frog.say();
    frog.breatheAir();
    frog.run();
    frog.eat();
    frog.food();


    var parrot = new Parrot();
    parrot.setName("Kesha");
    System.out.println(parrot.getName());
    parrot.say();
    parrot.breatheAir();
    parrot.run();
    parrot.eat();
    parrot.food();


    var snake = new Snake();
    snake.setName("Nagaini");
    System.out.println(snake.getName());
    snake.say();
    snake.breatheAir();
    snake.run();
    snake.eat();
    snake.food();

  }

}
