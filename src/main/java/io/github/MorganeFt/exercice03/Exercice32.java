package io.github.MorganeFt.exercice03;

public class Exercice32 {

	public static void main(String[] arg) {
		biggestDivisor();
	}

	static void biggestDivisor() {
		int numberDivisor = 0;
		int biggestNumber = 0;

		for (int i = 1; i <= 10000; i++) {
			int counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter > numberDivisor) {
				numberDivisor = counter;
				biggestNumber = i;
			}
		}
		System.out.println(biggestNumber + " have " + numberDivisor + " divisors");
	}
}
