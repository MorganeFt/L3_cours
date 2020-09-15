package io.github.MorganeFt.Exercice02;

import java.util.Scanner;

class Exercice24 {

	public static void main(String[] arg) {
		change();
	}

	static void change() {
		System.out.print("Nombre de pi\u00e8ce de 1 centime : ");
		Scanner cts = new Scanner(System.in);
		int cts1 = cts.nextInt();
		cts.close();

		System.out.print("\nNombre de pi\u00e8ce de 2 centimes : ");
		Scanner newcts = new Scanner(System.in);
		int cts2 = newcts.nextInt();
		newcts.close();

		System.out.print("\nNombre de pi\u00e8ce de 5 centimes : ");
		Scanner newnewcts = new Scanner(System.in);
		int cts5 = newnewcts.nextInt();
		newnewcts.close();

		double totalChange = 0.01 * cts1 + 0.02 * cts2 + 0.05 * cts5;

		System.out.println("Vous avez " + totalChange + " euro en pi\u00e8ce de monnaie");
	}
}