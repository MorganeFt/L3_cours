package io.github.MorganeFt.exercice03;

class Exercice31 {

	public static void main(String[] arg) {
		snakeEye();
	}

	static void snakeEye() {
		int D1 = (int) (Math.random() * 6) + 1;
		int D2 = (int) (Math.random() * 6) + 1;
		int countRoll = 1;
		while (!(D1 == 1 && D2 == 1)) {
			D1 = (int) (Math.random() * 6) + 1;
			D2 = (int) (Math.random() * 6) + 1;
			countRoll++;
		}
		System.out.println(
				"How many times do you have to roll a pair of dice before they come up snake eyes?  " + countRoll);
	}
}