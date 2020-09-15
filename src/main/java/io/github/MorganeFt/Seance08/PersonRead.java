package io.github.MorganeFt.Seance08;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PersonRead {

	public static List<Person> readPersons(BufferedReader reader) throws IOException {
		List<Person> personList = new ArrayList<>();
		String firstName;

		try {
			while ((firstName = reader.readLine()) != null) {
				Person person = new Person();
				person.setFirstName(firstName);
				person.setLastName(reader.readLine());
				personList.add(person);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return personList;
	}

	public static void main(String[] args) throws IOException {
		Path filePath = Path.of("src/main/resources/io/github/MorganeFt/Seance8/NameList.txt");
		List<Person> myList = readPersons(Files.newBufferedReader(filePath, StandardCharsets.UTF_8));
		System.out.println(myList);

		for (Person person : myList) {
			System.out.println(person.toString());
		}
	}
}
