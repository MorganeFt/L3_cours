package io.github.MorganeFt.Seance07;

import java.util.Iterator;

public class StringPairIterator implements Iterator<String> {

	Pair<String, String> myPair;
	private int counter = 0;

	public StringPairIterator(Pair<String, String> p) {
		this.myPair = p;
	}

	@Override
	public boolean hasNext() {
		if (counter == 1 || counter == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String next() {
		counter++;
		if (counter == 1) {
			return myPair.getLeft();
		}
		if (counter == 2) {
			return myPair.getRight();
		} else {
			IllegalStateException error = new IllegalStateException();
			throw error;
		}
	}
}
