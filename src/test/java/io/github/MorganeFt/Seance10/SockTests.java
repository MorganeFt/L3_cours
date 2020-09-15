package io.github.MorganeFt.Seance10;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class SockTests {

	@Test
	void sockTest() {
		Sock sock1 = new Sock("blue", 39);
		Sock sock2 = new Sock("blue", 41);
		Sock sock3 = new Sock("blue", 39);
		
		assertFalse(sock1.equals(sock2));
		assertTrue(sock1.equals(sock3));
		assertTrue(sock1.getColor().equals(sock2.getColor()));
		assertFalse(Integer.toString(sock1.getSize()).equals(Integer.toString(sock2.getSize())));
		
		assertEquals(sock1.hashCode(), sock3.hashCode());
		assertNotEquals(sock1.hashCode(), sock2.hashCode());
	}
}
