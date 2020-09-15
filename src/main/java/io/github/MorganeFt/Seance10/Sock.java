package io.github.MorganeFt.Seance10;

import java.util.Objects;

public class Sock {

	private String color;
	private int size;
	
	public Sock(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}
	
	@Override
	public boolean equals(Object o2) {
		if (!(o2 instanceof Sock)) {
			return false;
		}
		if (this == o2) {
			return true;
		}
		Sock p2 = (Sock) o2;
		return color.equals(p2.color) && Integer.toString(size).equals(Integer.toString(p2.size));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(color, size);
	}
}
