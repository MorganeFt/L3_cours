package io.github.MorganeFt.Exercice05;

import java.util.Scanner;

public class Exercice56 {

	private static int[] userAnswer = new int[10];
	private static AdditionQuestion[] question = new AdditionQuestion[10];

	public static void main(String[] args) {

		System.out.println("Welcome to the game 2.0 !");
		System.out.println("You will have to answer 10 questions");
		System.out.println("Let's go !\n");

		Scanner inputValue;
		for (int i = 0; i < 10; i++) {
			System.out.print("Question " + (i + 1) + " : ");
			question[i] = new AdditionQuestion();

			System.out.println(question[i].getQuestion());
			inputValue = new Scanner(System.in);
			userAnswer[i] = inputValue.nextInt();
		}
		System.out.println("\nYour answers : ");

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
