package io.github.MorganeFt.Exercice04;

import java.util.Scanner;

public class Exercice48 {

	private static int[] firstNumber = new int[10];
	private static int[] secondNumber = new int[10];
	private static int[] userAnswer = new int[10];

	public static void main(String[] args) {
		createQuiz();
		System.out.println("Welcome to the game !");
		System.out.println("You will have to answer 10 questions");
		System.out.println("Let's go !\n");

		administrateQuiz();
		System.out.println("\nYour answers : ");

		gradeQuiz();
	}

	public static void createQuiz() {
		for (int i = 0; i < 10; i++) {
			firstNumber[i] = (int) (Math.random() * 100) + 1;
			secondNumber[i] = (int) (Math.random() * 100) + 1;
		}
	}

	public static void administrateQuiz() {
		Scanner inputValue;
		for (int i = 0; i < 10; i++) {
			System.out.println("Question " + (i + 1) + " : " + firstNumber[i] + " + " + secondNumber[i] + " = ");
			inputValue = new Scanner(System.in);
			userAnswer[i] = inputValue.nextInt();
		}
	}

	public static void gradeQuiz() {
		int score = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println(
					"Question " + (i + 1) + " : " + firstNumber[i] + " + " + secondNumber[i] + " = " + userAnswer[i]);

			if (userAnswer[i] == (firstNumber[i] + secondNumber[i])) {
				System.out.println("Correct answer !");
				score++;
			} else {
				System.out.println("Wrong answer ! The correct one is : " + (firstNumber[i] + secondNumber[i]));
			}
		}
		System.out.println("\nYou've got " + score + "/10 !");
	}
}
