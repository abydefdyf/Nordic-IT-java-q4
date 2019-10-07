package com.example;

import java.util.ArrayList;

public class FibonacciArray30 {

	public static void main(String[] args) {
		
		var numberFibonacci = new ArrayList<Integer>(30);
		
		calculationFibonacci(numberFibonacci);
		
		System.out.println("Список из 30 первых чисел Фибоначчи \n" + numberFibonacci);

	}

	public static void calculationFibonacci(ArrayList<Integer> numberFibonacci) {
		numberFibonacci.add(0, 0);
		numberFibonacci.add(1, 1);
		numberFibonacci.add(2, 1);

		for (int i = 3; i < 30; i++) {
			numberFibonacci.add(i, numberFibonacci.get(i - 1) + numberFibonacci.get(i - 2));
		}
	}

}
