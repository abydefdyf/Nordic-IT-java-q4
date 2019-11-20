package com.comparator;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApplication {

  public static void main(String[] args) {
    ArrayList<String> history = new ArrayList<String>();

    var scanner = new Scanner(System.in);
    
    System.out.println("Сортировка чисел.");
    
    System.out.println("Введите числа:");

    var number = scanner.nextLine();

    while (!"".equals(number)) {
      history.add(number);
      number = scanner.nextLine();
    }

    history.sort(new NumberComparatorMax());
    
    System.out.println("Числа рассортированны, от меньшего к большему:");

    for (var a : history) {
      System.out.println(a);
    }
    
    history.sort(new NumberComparatorMin());
    
    System.out.println("Числа рассортированны, от большего к меньшему:");

    for (var a : history) {
      System.out.println(a);
    }

  }

}
