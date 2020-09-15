package io.github.MorganeFt.Exercice05;

public class PairOfDice {

	private int die1;
	private int die2;

	public void roll() {
		die1 = (int) (Math.random() * 6) + 1;
		die2 = (int) (Math.random() * 6) + 1;
	}

	public int getDie1() {
		return die1;
	}

	public int getDie2() {
		return die2;
	}

	public String toString() {
		return ("Value of die 1 : " + getDie1() + "\nValue of die 2 : " + getDie2());
	}
}