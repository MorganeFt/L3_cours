package io.github.MorganeFt.exercice03;

import java.util.Scanner;

class Exercice33 {

	public static void main(String[] arg) {
		calculator();
	}

	static void calculator() {
		String operation = "";
		double num1;
		double num2;
		int placeSymbol;
		double result = 0;

		do {
			System.out.print("Your operation : ");
			Scanner operationInput = new Scanner(System.in);
			operation = operationInput.nextLine();
			operationInput.close();

			if (operation.contains("+")) {
				placeSymbol = operation.indexOf("+");
				num1 = Double.valueOf(operation.substring(0, placeSymbol));
				num2 = Double.valueOf(operation.substring(placeSymbol + 1));
				result = num1 + num2;

				System.out.println("Your result is : " + result);
			}
			if (operation.contains("-")) {
				placeSymbol = operation.indexOf("-");
				num1 = Double.valueOf(operation.substring(0, placeSymbol));
				num2 = Double.valueOf(operation.substring(placeSymbol + 1));
				result = num1 - num2;

				System.out.println("Your result is : " + result);
			}
			if (operation.contains("*")) {
				placeSymbol = operation.indexOf("*");
				num1 = Double.valueOf(operation.substring(0, placeSymbol));
				num2 = Double.valueOf(operation.substring(placeSymbol + 1));
				result = num1 * num2;

				System.out.println("Your result is : " + result);
			}
			if (operation.contains("/")) {
				placeSymbol = operation.indexOf("/");
				num1 = Double.valueOf(operation.substring(0, placeSymbol));
				num2 = Double.valueOf(operation.substring(placeSymbol + 1));
				result = num1 / num2;

				System.out.println("Your result is : " + result);
			}

		} while (!operation.equals("0"));
		System.out.println("Bye bye");
	}
}