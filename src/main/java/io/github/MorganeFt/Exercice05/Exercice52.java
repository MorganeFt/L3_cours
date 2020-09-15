package io.github.MorganeFt.Exercice05;

public class Exercice52 {

	public static void main(String[] args) {
		StatCalc myCalc = new StatCalc();
		myCalc.enter(15);
		myCalc.enter(13);
		myCalc.enter(17);

		System.out.println("My count is : " + myCalc.getCount());
		System.out.println("My sum is : " + myCalc.getSum());
		System.out.println("My mean is : " + myCalc.getMean());
		System.out.println("My standard-deviation is : " + myCalc.getStandardDeviation());
		System.out.println("My min is : " + myCalc.getMin());
		System.out.println("My max is : " + myCalc.getMax());
		System.out.print("My array is : ");
		for (int i = 0; i < myCalc.getArray().length; i++) {
			System.out.print(myCalc.getArray()[i] + ", ");
		}
	}
}
