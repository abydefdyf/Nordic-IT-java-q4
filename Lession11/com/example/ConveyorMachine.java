package com.example;

import java.util.ArrayList;

public class ConveyorMachine {

  public static void main(String[] args) throws InterruptedException {

    var pool = new ArrayList<Thread>();

    for (int i = 0; i < 20; i++) {

      var thread1 = new Thread(new machine1());
      var thread2 = new Thread(new machine2());
      var thread3 = new Thread(new machine3());
      var thread4 = new Thread(new machine4());
      var thread5 = new Thread(new machine5());
      var thread6 = new Thread(new machine6());

      thread1.start();
      thread2.start();

      thread1.join();
      System.out.println("Станок один завершил работу");
      thread2.join();
      System.out.println("Станок два завершил работу");


      thread3.start();
      thread3.join();
      System.out.println("Станок три завершил работу");

      thread4.start();
      thread5.start();

      thread4.join();
      System.out.println("Станок четыре завершил работу");
      thread5.join();
      System.out.println("Станок пять завершил работу");


      thread6.start();
      pool.add(thread6);

    }

    for (var over : pool) {
      over.join();
      System.out.println("Станок шесть завершил работу");
    }

  }

}


