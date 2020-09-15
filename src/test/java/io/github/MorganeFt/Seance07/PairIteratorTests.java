package io.github.MorganeFt.Seance07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.MorganeFt.Seance07.Pair;
import io.github.MorganeFt.Seance07.PairIterator;

public class PairIteratorTests {

	@Test
	void TestPairIterator() {
		Pair<Integer, Integer> test = new Pair<Integer, Integer>();
		test.setContents(2, 3);
		
		PairIterator<Integer> iteTest = new PairIterator<Integer>(test);
		
		Assertions.assertEquals(true, iteTest.hasNext());
		Assertions.assertEquals(2, iteTest.next());
		Assertions.assertEquals(true, iteTest.hasNext());
		Assertions.assertEquals(3, iteTest.next());
		Assertions.assertEquals(false, iteTest.hasNext());
		
	}
	
}
