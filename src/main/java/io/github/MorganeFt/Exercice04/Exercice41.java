package io.github.MorganeFt.Exercice04;

import java.util.Scanner;

/**
 * This class capitalize the first letter of a sentence.
 * 
 * @author morgane.fiot
 * 
 * @param sentence must contain strings
 * 
 * @throws IllegalArgumentException If the contains number
 */

public class Exercice41 {

	public static void main(String[] args) {
		System.out.print("Please enter your sentence to capitalize : ");
		Scanner inputSentence = new Scanner(System.in);
		String sentence = inputSentence.nextLine();
		inputSentence.close();

		printCapitalized(sentence);

	}

	static void printCapitalized(String sentence) {
		String[] sentenceArray = sentence.split(" ");

		for (int i = 0; i < sentenceArray.length; i++) {
			if (sentenceArray[i].matches(".*\\d.*")) {
				IllegalArgumentException exc = new IllegalArgumentException("The sentence must not contain numbers.");
				throw exc;
			}

			sentenceArray[i] = sentenceArray[i].substring(0, 1).toUpperCase() + sentenceArray[i].substring(1);
			System.out.print(sentenceArray[i] + " ");
		}
	}
}
