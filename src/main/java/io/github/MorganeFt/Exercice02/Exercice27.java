package io.github.MorganeFt.Exercice02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Exercice27 {

	public static void main(String[] arg) {
		average();
	}

	static void average() {
		try {
			Scanner sc = new Scanner(
					new FileInputStream("src/main/resources/io/github/MorganeFt/Exercice2/testdata.txt"));
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}