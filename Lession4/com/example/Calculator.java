package com.example;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);

		System.out.println("Введите один из символов: +, -, *, /, div, mod, ^ ");
		var act = scanner.next();

		while (!(("+".equals(act)) || ("-".equals(act)) || ("*".equals(act)) || ("/".equals(act)) || ("div".equals(act))
				|| ("mod".equals(act)) || ("^".equals(act)))) {

			System.out.println("Вы ввели неправильный символ, повторите");
			act = scanner.next();

		}
		System.out.println("Введите два числа: ");
		var number1 = scanner.nextInt();
		var number2 = scanner.nextInt();
		var number3 = 0d;

		if ("+".equals(act)) {
			number3 = number1 + number2;
			System.out.println("Ваш ответ равен: " + number3);

		} else if ("-".equals(act)) {
			number3 = number1 - number2;
			System.out.println("Ваш ответ равен: " + number3);

		} else if ("*".equals(act)) {
			number3 = number1 * number2;

			System.out.println("Ваш ответ равен: " + number3);

		} else if ("/".equals(act) && number2 != 0) {
			number3 = number1 / number2;
			System.out.println("Ваш ответ равен: " + number3);

		} else if ("div".equals(act) && number2 != 0) {

			System.out.println("Ваш ответ равен: " + Math.floor(number1 / number2));

		} else if ("mod".equals(act) && number2 != 0) {
			number3 = number1 % number2;
			System.out.println("Ваш ответ равен: " + number3);

		} else if ("^".equals(act)) {
			if (number2 < 0) {
				System.out.println("Вы ввели отрицательную степень");
			} else {
				System.out.println("Ваш ответ равен: " + power(number1, number2));
			}
		} else if (number2 == 0) {
			System.out.println("На ноль делить нельзя");
		}
	}

	public static int power(int number1, int number2) {
		var pow = 1;
		for (int i = 0; i < number2; i++) {
			pow = pow * number1;
		}
		return pow;
	}

}