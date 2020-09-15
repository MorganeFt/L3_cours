package io.github.MorganeFt.Seance12;

import org.checkerframework.checker.nullness.qual.Nullable;

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
public class IsGreaterThan implements Predicate<Person> {

	private int defaultHeight;
	
	public IsGreaterThan(int defaultHeight) {
		this.defaultHeight = defaultHeight;
	}
	
	@Override
	public boolean test(Person person) {
		if (person.getHeight() > defaultHeight) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean apply(@Nullable Person input) {
		return false;
	}

}
