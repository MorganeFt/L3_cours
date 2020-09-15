package io.github.MorganeFt.Exercice04;

public class Exercice44 {

	public static void main(String[] args) {
		double[] resultArray;
		resultArray = runForEachDiceValue();
		System.out.println("Total On Dice\tAverage Number of Rolls");
		System.out.println("-------------\t-----------------------");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println("\t" + (i + 2) + "\t\t" + resultArray[i]);
		}

	}

	static double run1000Times(int value) {
		double sumRoll = 0;
		for (int i = 0; i < 1000; i++) {
			sumRoll += Exercice43.rollTwoDice(value);
		}
		return sumRoll / 1000;
	}

	static double[] runForEachDiceValue() {
		double[] resultArray = new double[11];
		for (int i = 2; i < 13; i++) {
			resultArray[i - 2] = run1000Times(i);
		}
		return resultArray;
	}
}
