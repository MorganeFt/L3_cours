package io.github.MorganeFt.Seance09;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int lengthName1 = o1.getLastName().length();
		int lengthName2 = o2.getLastName().length();

		if (lengthName1 < lengthName2) {
			return -1;
		} else if (lengthName1 == lengthName2) {
			return 0;
		} else {
			return 1;
		}
	}
}
