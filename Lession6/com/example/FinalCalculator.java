package com.example;

import java.util.Scanner;

public class FinalCalculator {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);

		System.out.println("Введите один из символов: +, -, *, /, div, mod, ^ ");
		var act = scanner.next();

		act = extracted(scanner, act);

		System.out.println("Введите два числа: ");
		var number1 = scanner.nextDouble();
		var number2 = scanner.nextDouble();

		var number3 = 0d;

		if ("+".equals(act)) {
			number3 = number1 + number2;
			fractionalСheck(number3);
		} else if ("-".equals(act)) {
			number3 = number1 - number2;
			fractionalСheck(number3);
		} else if ("*".equals(act)) {
			number3 = number1 * number2;
			fractionalСheck(number3);
		} else if ("/".equals(act) && number2 != 0) {
			number3 = number1 / number2;
			fractionalСheck(number3);
		} else if ("div".equals(act) && number2 != 0) {
			System.out.println("Ваш ответ равен: " + (int) (Math.floor(number1 / number2)));
		} else if ("mod".equals(act) && number2 != 0) {
			number3 = number1 % number2;
			fractionalСheck(number3);
		} else if ("^".equals(act)) {
			System.out.println("Ваш ответ равен: " + power((int) number1, (int) Math.abs(number2)));
		} else if (number2 == 0) {
			System.out.println("На ноль делить нельзя");
		}
	}

	public static String extracted(Scanner scanner, String act) {
		while (!(("+".equals(act)) || ("-".equals(act)) || ("*".equals(act)) || ("/".equals(act)) || ("div".equals(act))
				|| ("mod".equals(act)) || ("^".equals(act)))) {
			System.out.println("Вы ввели неправильный символ, повторите");
			act = scanner.next();
		}
		return act;
	}

	public static void fractionalСheck(double number3) {
		if (isDoubleInt(number3)) {
			System.out.println("Ваш ответ равен: " + (int) number3);
		} else {
			System.out.println("Ваш ответ равен: " + number3);
		}
	}

	public static int power(int number1, int number2) {
		if (number1 >= 0) {
			int pow = 1;
			for (int i = 0; i != number2; i++) {
				pow = pow * number1;
			}
			return (int) pow;
		} else {
			int pow = 1;
			for (int i = 0; i != number2; i++) {
				pow = pow * number1;
			}
			pow = Math.abs(pow) * -1;
			return (int) pow;
		}
	}

	public static boolean isDoubleInt(double number3) {
		var ebs = 1e-12;
		return Math.abs(Math.floor(number3) - number3) < ebs;
	}

}