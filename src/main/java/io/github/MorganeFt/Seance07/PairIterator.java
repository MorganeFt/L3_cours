package io.github.MorganeFt.Seance07;

import java.util.Iterator;

public class PairIterator<E> implements Iterator<E> {

	Pair<E, E> myPair;
	private int counter = 0;

	public PairIterator(Pair<E, E> p) {
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
	public E next() {
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
