package io.github.MorganeFt.Exercice04;

import java.util.Scanner;

public class Exercice42 {

	public static void main(String[] arg) {
		hexValue();
	}

	static void hexValue() {
		System.out.print("What's your name : ");
		Scanner userInput = new Scanner(System.in);
		String namestring = userInput.nextLine();
		userInput.close();

		System.out.println("Hello, " + namestring.toUpperCase() + ", nice to meet you!");
	}
}