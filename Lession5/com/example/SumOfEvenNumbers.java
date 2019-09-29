package com.example;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);

		System.out.println("Введите целое, положительное число");
		var number = scanner.nextInt();

		var sum = 0;

		while (number < 0) {
			System.out.println("Вы ввели отрицательное число, попробуйте ещё раз");
			number = scanner.nextInt();
		}

		for (int i = 0; i <= number; i = i + 2) {

			sum = sum + i;

		}
		System.out.println("Ваш ответ равен: " + sum);

	}

}
