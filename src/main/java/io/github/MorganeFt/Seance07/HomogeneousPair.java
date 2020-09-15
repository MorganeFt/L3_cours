package io.github.MorganeFt.Seance07;

import java.util.Iterator;

public class HomogeneousPair<E> extends Pair<E, E> implements Iterable<E> {

	@Override
	public Iterator<E> iterator() {
		return new PairIterator<E>(this);
	}
}
