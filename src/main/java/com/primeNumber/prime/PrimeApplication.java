package com.primeNumber.prime;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(PrimeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    var scanner = new Scanner(System.in);
    System.out.println("Введите положительное число"); // Предел int 2147483647
    var number = scanner.nextInt();
    if (primeOrComposite(number)) {
      System.out.println("Число простое");
    } else {
      System.out.println("Число не простое");
    }

  }

  public boolean primeOrComposite(int number) {
    if (number != 1 && number > 0) {
      for (int i = 2; i < number - 1; i++) {
        if (number % i == 0 || number == 1) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

}
