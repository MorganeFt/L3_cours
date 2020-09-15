package io.github.MorganeFt.Exercice02;

public class Exercice22 {

	public static void main(String[] arg) {
		dice();
	}

	static void dice() {
		int D1 = (int) (Math.random() * 6) + 1;
		int D2 = (int) (Math.random() * 6) + 1;
		int somme = D1 + D2;
		System.out.println("The first die comes up " + D1);
		System.out.println("The second die comes up " + D2);
		System.out.println("Your total roll is " + somme);
	}
}
