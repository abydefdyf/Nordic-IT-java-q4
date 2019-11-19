package com.wordGame;

import java.util.Scanner;
import com.example.exceptions.NewWordException;
import com.example.exceptions.RepeatWordException;


public class GeneratorName {

  public static void main(String[] args) {
    System.out
        .println("Игра в слова! Составьте как можно больше слов из \"автоэлектростеклоподъемник\"");

    var scanner = new Scanner(System.in);

    System.out.println("Игрок один: введите слово");
    var namePlayer1 = scanner.nextLine();

    System.out.println("Игрок два: введите слово");
    var namePlayer2 = scanner.nextLine();

    var generator = new Generator();

    while ((!"".equals(namePlayer1)) || (!"".equals(namePlayer2))) {
      try {
        generator.generateNamePlayer1(namePlayer1);
      } catch (NewWordException ex) {
        System.out.println("Игрок один ввел новое слово");
      } catch (RepeatWordException ex) {
        System.out.println("Игрок один ввел повторное слово");
      }
      try {
        generator.generateNamePlayer2(namePlayer2);
      } catch (NewWordException ex) {
        System.out.println("Игрок два ввел новое слово");
      } catch (RepeatWordException ex) {
        System.out.println("Игрок два ввел повторное слово");
      }

      System.out.println("Игрок один: введите слово");
      namePlayer1 = scanner.nextLine();

      System.out.println("Игрок два: введите слово");
      namePlayer2 = scanner.nextLine();
    }

    if (generator.getLengthPlayer1() > generator.getLengthPlayer2()) {
      System.out.println("Победитель игрок один!");
    } else if (generator.getLengthPlayer1() < generator.getLengthPlayer2()) {
      System.out.println("Победитель игрок два!");
    } else {
      System.out.println("Ничья!");
    }


    System.out.print("Все используемые слова: ");
    var a = generator.getFirstElementPlayer();
    while (!"".equals(a)) {
      System.out.print(" " + a + " ");
      a = generator.getFirstElementPlayer();
    }
  }
}

