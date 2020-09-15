package io.github.MorganeFt.exercice03;

import java.util.Arrays;

public class Exercice36 {

	public static void main(String[] arg) {
		biggestDivisor();
	}

	static void biggestDivisor() {
		int numberDivisor = 0;
		int[] biggestNumber = new int[0];

		for (int i = 1; i <= 10000; i++) {
			int counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == numberDivisor) {
				biggestNumber = Arrays.copyOf(biggestNumber, biggestNumber.length + 1);
				biggestNumber[biggestNumber.length - 1] = i;
			}
			if (counter > numberDivisor) {
				numberDivisor = counter;
				biggestNumber = new int[1];
				biggestNumber[0] = i;
			}
		}
		System.out.println("Among integers between 1 and 10000,");
		System.out.println("The maximum number of divisors was " + numberDivisor);
		System.out.println("Numbers with that many divisors include:");

		for (int i = 0; i < biggestNumber.length; i++) {
			System.out.println(biggestNumber[i]);
		}
	}
}
