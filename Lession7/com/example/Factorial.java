package com.example;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.println("Введите положительное число:");
		var number = scanner.nextLong();

		number = checkNumber(scanner, number);

		System.out.println("Ваш ответ равен: " + factorial(number));

	}

	public static long checkNumber(Scanner scanner, long number) {
		while (number < 0) {
			System.out.println("Вы ввели отрицательное число! Повторите ввод: ");
			number = scanner.nextLong();
		}
		return number;
	}

	public static long factorial(long number) {
		var f = 1L;
		if (number <= 1) {
			return f;
		} else {
			return f = number * factorial(number - 1);
		}

	}

}
