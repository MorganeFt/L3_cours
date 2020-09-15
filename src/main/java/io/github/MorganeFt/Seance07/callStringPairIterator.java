package io.github.MorganeFt.Seance07;

import java.util.Iterator;

public class callStringPairIterator {

	public static void main(String[] args) {
		Pair<String, String> myPair = new Pair<String, String>();
		myPair.setContents("abc", "xyz");

		Pair<String, String> pair1 = new Pair<String, String>();
		pair1.setContents("bla", "blo");

		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>();
		pair2.setContents(123, 456);

		StringPairIterator myIterator = new StringPairIterator(myPair);
		PairIterator<String> ite1 = new PairIterator<String>(pair1);
		PairIterator<Integer> ite2 = new PairIterator<Integer>(pair2);

		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}

		while (ite1.hasNext()) {
			System.out.println(ite1.next());
		}

		while (ite2.hasNext()) {
			System.out.println(ite2.next());
		}

		HomogeneousPair<String> mySingle = new HomogeneousPair<String>();
		mySingle.setContents("test", "fail");
		Iterator<String> ite3 = mySingle.iterator();

		while (ite3.hasNext()) {
			System.out.println(ite3.next());
		}
	}
}
