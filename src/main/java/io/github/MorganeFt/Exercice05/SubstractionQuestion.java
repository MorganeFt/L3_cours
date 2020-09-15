package io.github.MorganeFt.Exercice05;

public class SubstractionQuestion implements IntQuestion {

	private int a, b; // The numbers in the problem.

	public SubstractionQuestion() { // constructor
		a = (int) (Math.random() * 50 + 1);
		b = (int) (Math.random() * 50);
		if (a < b) {
			int save = a;
			a = b;
			b = save;
		}
	}

	@Override
	public String getQuestion() {
		return "What is " + a + " - " + b + " ?";
	}

	@Override
	public int getCorrectAnswer() {
		return a - b;
	}
}