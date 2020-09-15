package io.github.MorganeFt.Seance09;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EasyMapImpl implements EasyMap {

	Map<String, Person> myMaps = new HashMap<String, Person>();

	@Override
	public void put(String personName, Person person) {
		myMaps.put(personName, person);
	}

	@Override
	public Optional<Person> returnPair(String key) {
		if (myMaps.get(key) != null) {
			return Optional.of(myMaps.get(key));
		}
		return Optional.empty();
	}

	@Override
	public List<Person> listOrdered() {
		List<Person> valueMap = new ArrayList<>();
		myMaps.forEach((key, value) -> {
			valueMap.add(value);
		});
		Collections.sort(valueMap, new MyComparator());

		return valueMap;
	}
}
