package io.github.MorganeFt.Seance12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.jupiter.api.Test;

import com.google.common.base.Predicate;

/***
 * Define a class IsGreaterThan which implements Predicate<Person>. Its
 * constructor receives an height. Its test method returns true iff the person
 * is greater than the height given when building it. Test it similarly in a
 * unit test. Similarly, make sure your test includes a line such as
 * Predicate<Person> myPredicate = ….
 * 
 * @author morgane.fiot
 *
 */
public class IsGreaterThanTests {
	
	@Test
	public void testTest() {
		Set<Person> mySet = new HashSet<>();
		mySet.addAll(Arrays.asList(new Person("Gabriel", 185), new Person("Morgane", 165), new Person("Clémence", 160),
				new Person("Etienne", 170), new Person("Avi", 170), new Person("Gabriel", 175),
				new Person("Marcellino", 112), new Person("Hedi", 169)));

		Stream<Person> mySetStream = mySet.stream();
		Stream<Person> mySetStreamFilter = mySetStream.filter(person -> {
			Predicate<Person> myPredicate = new IsGreaterThan(165);
			return myPredicate.test(person);
		});

		assertEquals(5, mySetStreamFilter.count());
	}

}
