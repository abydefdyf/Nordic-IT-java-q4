package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciArray {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.println("Введите положительное число: ");
		var number = scanner.nextInt();
		
		number = checkNumber(scanner, number);
		
			var numberFibonacci = new ArrayList<Integer>(number);

			calculationFibonacci(number, numberFibonacci);
			
			System.out.println("Ваш ответ равен: " + numberFibonacci.get(number));
		}

	public static void calculationFibonacci(int number, ArrayList<Integer> numberFibonacci) {
		
		numberFibonacci.add(0, 0);
		numberFibonacci.add(1, 1);
		numberFibonacci.add(2, 1);

		for (int i = 3; i < number + 1; i++) {
			numberFibonacci.add(i, numberFibonacci.get(i - 1) + numberFibonacci.get(i - 2));
		}
	}

	public static int checkNumber(Scanner scanner, int number) {
		while (number < 0) {
			System.out.println("Вы ввели отрицательное число! Повторите ввод: ");
			number = scanner.nextInt();
		}
		return number;
	}
	}

