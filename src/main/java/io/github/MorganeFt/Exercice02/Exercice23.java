package io.github.MorganeFt.Exercice02;

import java.util.Scanner;

public class Exercice23 {

	public static void main(String[] arg) {
		name();
	}

	static void name() {
		System.out.print("What's your name : ");
		Scanner userInput = new Scanner(System.in);
		String namestring = userInput.nextLine();

		System.out.println("Hello, " + namestring.toUpperCase() + ", nice to meet you!");
		userInput.close();
	}
}