package com.example;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class CashboxUpdate {

  public static void main(String[] args) throws InterruptedException {
    var visitors = new LinkedBlockingDeque<Integer>();
    var vector = new LinkedBlockingDeque<Integer>();


    for (var i = 1; i < 2001; i++) {
      visitors.add(i);

    }

    System.out.println("В магазин пришло : " + visitors.size() + " посетителей");
    System.out.println("Посетителей в очереди: " + visitors);
    var executorService = Executors.newFixedThreadPool(4);

    executorService.invokeAll(
        Arrays.asList(
            Executors.callable(new NextGenerationUpdate(visitors, vector)),
            Executors.callable(new NextGenerationUpdate(visitors, vector)),
            Executors.callable(new NextGenerationUpdate(visitors, vector)),
            Executors.callable(new NextGenerationUpdate(visitors, vector))
        )
    );
    executorService.shutdown();


    System.out.println("Обрабатывем посетителей: " + vector);
    System.out.println("Всего обработано: " + vector.size() + " посетителей");

  }

}


