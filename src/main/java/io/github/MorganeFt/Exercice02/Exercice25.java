package io.github.MorganeFt.Exercice02;

import java.util.Scanner;

public class Exercice25 {

	public static void main(String[] arg) {
		eggs();
	}

	static void eggs() {
		System.out.print("Number of eggs : ");
		Scanner o = new Scanner(System.in);
		int egg = o.nextInt();
		o.close();

		int gross = egg / 144;
		int dozen = (egg % 144) / 12;
		int left = (egg % 144) % 12;

		System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + left + " left !");
	}
}