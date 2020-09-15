package io.github.MorganeFt.Exercice02;

import java.util.Scanner;

class Exercice26 {

	public static void main(String[] arg) {
		name();
	}

	static void name() {
		System.out.print("Please enter your first name and last name, separated by a space : ");
		Scanner name = new Scanner(System.in);
		String namestring = name.nextLine();
		name.close();

		int placespace = namestring.indexOf(" ");

		String firstname = namestring.substring(0, placespace);
		String lastname = namestring.substring(placespace + 1);

		int firstnamelength = firstname.length();
		int lastnamelength = lastname.length();

		String initials = firstname.substring(0, 1).concat(lastname.substring(0, 1));

		System.out.println("Your first name is " + firstname + ", which has " + firstnamelength + " characters");
		System.out.println("Your last name is " + lastname + ", which has " + lastnamelength + " characters");
		System.out.println("Your initials are " + initials);
	}
}