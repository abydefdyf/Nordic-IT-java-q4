package com.example;

import java.util.Scanner;

public class FinalCalculator {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);

		System.out.println("Введите один из символов: +, -, *, /, div, mod, ^ ");
		var act = scanner.next();

		act = checkSymbol(scanner, act);

		System.out.println("Введите два числа: ");
		var number1 = scanner.nextInt();
		var number2 = scanner.nextInt();
		

		calculator(act, number1, number2);
	}

	public static void calculator(String act, int number1, int number2) {
		if ("+".equals(act)) {
			sum(number1, number2);
		} else if ("-".equals(act)) {
			subtraction(number1, number2);
		} else if ("*".equals(act)) {
			multiplication(number1, number2);
		} else if ("/".equals(act) && number2 != 0) {
			divide(number1, number2);
		} else if ("div".equals(act) && number2 != 0) {
			split(number1, number2);
		} else if ("mod".equals(act) && number2 != 0) {
			balance(number1, number2);
		} else if ("^".equals(act)) {
			aNegativeNumber(number1, number2);
		} else if (number2 == 0) {
			System.out.println("На ноль делить нельзя");
		}
	}

	public static void aNegativeNumber(int number1, int number2) {
		if (number2 < 0) {
			System.out.println("Вы ввели отрицательную степень");
		} else {
			System.out.println("Ваш ответ равен: " + power(number1, number2));
		}
	}

	public static void balance(int number1, int number2) {
		var number3 = 0;
		number3 = number1 % number2;
		System.out.println("Ваш ответ равен: " + number3);
	}

	public static void split(double number1, double number2) {
		var number3 = 0d;
		number3 = Math.floor(number1 / number2);
		System.out.println("Ваш ответ равен: " + number3);
	}

	public static void divide(double number1, double number2) {
		var number3 = 0d;
		number3 = number1 / number2;
		System.out.println("Ваш ответ равен: " + number3);
	}

	public static void multiplication(int number1, int number2) {
		var number3 = 0;
		number3 = number1 * number2;
		System.out.println("Ваш ответ равен: " + number3);
	}

	public static void subtraction(int number1, int number2) {
		var number3 = 0;
		number3 = number1 - number2;
		System.out.println("Ваш ответ равен: " + number3);
	}

	public static void sum(int number1, int number2) {
		var number3 = 0;
		number3 = number1 + number2;
		System.out.println("Ваш ответ равен: " + number3);
	}

	public static String checkSymbol(Scanner scanner, String act) {
		while (!(("+".equals(act)) || ("-".equals(act)) || ("*".equals(act)) || ("/".equals(act)) || ("div".equals(act))
				|| ("mod".equals(act)) || ("^".equals(act)))) {
			System.out.println("Вы ввели неправильный символ, повторите");
			act = scanner.next();
		}
		return act;
	}

	public static int power(int number1, int number2) {
		var pow = 1;
		for (int i = 0; i < number2; i++) {
			pow = pow * number1;
		}
		return pow;
	}

}