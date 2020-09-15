package io.github.MorganeFt.Exercice05;

import java.util.Scanner;

public class Exercice57 {

	private static int[] userAnswer = new int[10];
	private static IntQuestion[] question = new IntQuestion[10];

	public static void main(String[] args) {
		System.out.println("Welcome to the game 2.0 !");
		System.out.println("You will have to answer 10 questions");
		System.out.println("Let's go !\n");

		createQuiz();
		administrateQuiz();

		System.out.println("\nYour answers : ");
		gradeQuiz();
	}

	public static void createQuiz() {
		for (int i = 0; i < 5; i++) {
			question[i] = new AdditionQuestionV2();
		}
		for (int i = 5; i < 9; i++) {
			question[i] = new SubstractionQuestion();
		}
		question[9] = new TextQuestion();
	}

	public static void administrateQuiz() {
		Scanner inputValue;
		for (int i = 0; i < 10; i++) {
			System.out.println(question[i].getQuestion() + " ");
			inputValue = new Scanner(System.in);
			userAnswer[i] = inputValue.nextInt();
		}
	}

	public static void gradeQuiz() {
		int score = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println(question[i].getQuestion() + " " + userAnswer[i]);

			if (userAnswer[i] == question[i].getCorrectAnswer()) {
				System.out.println("Correct answer !");
				score++;
			} else {
				System.out.println("Wrong answer ! The correct one is : " + question[i].getCorrectAnswer());
			}
		}
		System.out.println("\nYou've got " + score + "/10 !");
	}
}
