package io.github.MorganeFt.Seance06;

import java.io.IOException;

public class TestException {
	public static void main(String[] args) throws IOException {
		MyMethod();
	}

	public static void MyMethod() throws IOException {
		double myNumber = Math.random();

		if (myNumber > 0.5) {
			throw new IOException();
		} else {
			System.out.println("OK");
		}
	}
}
