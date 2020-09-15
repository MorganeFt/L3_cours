package io.github.MorganeFt.Seance12;

import org.checkerframework.checker.nullness.qual.Nullable;

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

public class IsNameAToG implements Predicate<Person> {

	@Override
	public boolean test(Person myPerson) {
		char firstChar = myPerson.getName().charAt(0);
		if (firstChar >= 65 && firstChar <= 71) {
			return true;
		}
		return false;
	}

	@Override
	public boolean apply(@Nullable Person input) {
		return false;
	}

}
