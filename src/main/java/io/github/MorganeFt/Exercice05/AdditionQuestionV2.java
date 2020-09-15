package io.github.MorganeFt.Exercice05;

public class AdditionQuestionV2 implements IntQuestion {

	private int a, b; // The numbers in the problem.

	public AdditionQuestionV2() { // constructor
		a = (int) (Math.random() * 50 + 1);
		b = (int) (Math.random() * 50);
	}

	@Override
	public String getQuestion() {
		return "What is " + a + " + " + b + " ?";
	}

	@Override
	public int getCorrectAnswer() {
		return a + b;
	}
}