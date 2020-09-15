package io.github.MorganeFt.Exercice05;

public class Exercice53 {

	public static void main(String[] args) {
		System.out.println("Total On Dice\tAverage Number of Rolls\tStandard-deviation Number of Rolls");
		System.out.println("-------------\t-----------------------\t----------------------------------");

		for (int j = 2; j < 13; j++) {
			StatCalc myCalc = new StatCalc();
			for (int i = 0; i < 1000; i++) {
				PairOfDice myPair = new PairOfDice();
				int countRoll = 0;

				while (myPair.getDie1() + myPair.getDie2() != j) {
					myPair.roll();
					countRoll++;
				}
				myCalc.enter(countRoll);
			}
			System.out.println("\t" + (j + 2) + "\t\t" + myCalc.getMean() + "\t\t\t" + myCalc.getStandardDeviation());
		}
	}
}
