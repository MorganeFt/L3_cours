package io.github.MorganeFt.Seance09;

import java.util.Optional;
import java.util.List;

public interface EasyMap {

	public static EasyMap newInstance() {
		return new EasyMapImpl();
	}

	public void put(String personName, Person person);

	public Optional<Person> returnPair(String key);

	public List<Person> listOrdered();
}
