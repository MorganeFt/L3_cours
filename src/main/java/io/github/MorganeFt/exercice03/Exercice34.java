package io.github.MorganeFt.exercice03;

import java.util.Scanner;

class Exercice34 {

	public static void main(String[] arg) {
		word();
	}

	static void word() {
		System.out.print("Your sentence : ");
		Scanner input = new Scanner(System.in);
		String textInput = input.nextLine();
		input.close();

		int placeSpace = textInput.indexOf(" ");

		do {
			System.out.println(textInput.substring(0, placeSpace));
			textInput = textInput.substring(placeSpace + 1);

			placeSpace = textInput.indexOf(" ");
		} while (placeSpace != -1);

		System.out.println(textInput);
	}
}
