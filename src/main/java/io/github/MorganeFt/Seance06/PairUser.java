package io.github.MorganeFt.Seance06;

public class PairUser {

	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new Pair<>();
		pair1.setContents("Morgane", 22);
		System.out.println(pair1.getLeft() + " : " + pair1.getRight());
		System.out.println(show(pair1));

		Pair<Double, Double> pair2 = new Pair<>();
		pair2.setContents(Math.random(), Math.random());
		System.out.println(pair2.getLeft() + " : " + pair2.getRight());
		System.out.println(show(pair2));

		Pair<Pair<String, Integer>, Pair<Double, Double>> pair3 = new Pair<>();
		pair3.setContents(pair1, pair2);
		System.out.println(show(pair3));
	}

	public static <L, R> String show(Pair<L, R> pair) {
		return (pair.toString() + " : " + pair.getLeft() + ", " + pair.getRight());
	}
}
