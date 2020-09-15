package io.github.MorganeFt.Seance12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.google.common.base.Predicate;

/***
 * Define a class IsNameAToG which implements Predicate<Person> and whose test
 * method returns true iff the name of the person, upper cased, starts with a
 * letter between A and G. In a unit test, define a set of persons, and use
 * stream() on the set, then filter and count on the resulting stream, to count
 * the number of persons in your set whose name match the predicate. In the unit
 * test, make sure you have a line looking like Predicate<Person> myPredicate =
 * ….
 * 
 * @author morgane.fiot
 *
 ***/

public class IsNameAToGTests {

	@Test
	public void testTest() {
		Set<Person> mySet = new HashSet<>();
		mySet.addAll(Arrays.asList(new Person("Gabriel", 185), new Person("Morgane", 165), new Person("Clémence", 160),
				new Person("Etienne", 170), new Person("Avi", 170), new Person("Gabriel", 175),
				new Person("Marcellino", 112), new Person("Hedi", 169)));

		Stream<Person> mySetStream = mySet.stream();
		Stream<Person> mySetStreamFilter = mySetStream.filter(person -> {
			Predicate<Person> myPredicate = new IsNameAToG();
			return myPredicate.test(person);
		});

		assertEquals(5, mySetStreamFilter.count());
	}

}
