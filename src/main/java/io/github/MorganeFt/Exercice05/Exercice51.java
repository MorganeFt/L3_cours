package io.github.MorganeFt.Exercice05;

public class Exercice51 {

	public static void main(String[] args) {
		PairOfDice myPair = new PairOfDice();
		int countRoll = 0;

		while (!(myPair.getDie1() == 1 && myPair.getDie2() == 1)) {
			myPair.roll();
			countRoll++;
		}
		System.out.println(myPair);
		System.out.println(
				"How many times do you have to roll a pair of dice before they come up snake eyes?  " + countRoll);
	}
}
