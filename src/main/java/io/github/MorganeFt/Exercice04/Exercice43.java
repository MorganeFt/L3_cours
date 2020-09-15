package io.github.MorganeFt.Exercice04;

import java.util.Scanner;

public class Exercice43 {

	public static void main(String[] args) {
		System.out.print("Please enter your value for the dice : ");
		Scanner inputValue = new Scanner(System.in);
		int value = inputValue.nextInt();
		inputValue.close();

		int resultDice = rollTwoDice(value);

		System.out.println(
				"How many times do you have to roll a pair of dice before obtaining " + value + "?  " + resultDice);
	}

	static int rollTwoDice(int value) {
		if (value < 2 | value > 12) {
			IllegalArgumentException exc = new IllegalArgumentException("Two dice can only make sum between 2 and 12.");
			throw exc;
		}

		int D1 = (int) (Math.random() * 6) + 1;
		int D2 = (int) (Math.random() * 6) + 1;
		int countRoll = 1;
		while (D1 + D2 != value) {
			D1 = (int) (Math.random() * 6) + 1;
			D2 = (int) (Math.random() * 6) + 1;
			countRoll++;
		}
		return countRoll;
	}
}
