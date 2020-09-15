package io.github.MorganeFt.Seance06;

public class Pair<L, R> {
	private L left;
	private R right;

	public void setContents(L left, R right) {
		this.left = left;
		this.right = right;
	}

	public L getLeft() {
		return left;
	}

	public R getRight() {
		return right;
	}
}
