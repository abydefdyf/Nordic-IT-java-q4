package com.example;

import java.util.ArrayList;
import java.util.Vector;

public class Cashbox {

  public static void main(String[] args) throws InterruptedException {
    var visitors = new Vector<Integer>();
    var vector = new Vector<Integer>();


    for (var i = 1; i < 2001; i++) {
      visitors.add(i);

    }

    System.out.println("В магазин пришло : " + visitors.size() + " посетителей");
    System.out.println("Посетителей в очереди: " + visitors);

    var threads = new ArrayList<Thread>();

    for (var i = 0; i < 4; i++) {
      threads.add(new Thread(new NextGeneration(visitors, vector)));

    }

    for (var thread : threads) {
      thread.start();
    }

    for (var thread : threads) {
      thread.join();
    }

    System.out.println("Обрабатывем посетителей: " + vector);
    System.out.println("Всего обработано: " + vector.size() + " посетителей");

  }

}


