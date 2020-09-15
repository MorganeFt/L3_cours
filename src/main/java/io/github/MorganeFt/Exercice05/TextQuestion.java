package io.github.MorganeFt.Exercice05;

public class TextQuestion implements IntQuestion {

	@Override
	public String getQuestion() {
		return "What is the answer to the ultimate question of life, the universe, and everything?";
	}

	@Override
	public int getCorrectAnswer() {
		return 42;
	}
}