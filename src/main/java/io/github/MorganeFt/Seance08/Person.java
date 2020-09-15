package io.github.MorganeFt.Seance08;

public class Person {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public String toString() {
		return getFirstName() + " " + getLastName();
	}
}
