package io.github.MorganeFt.Exercice05;

import java.util.Arrays;

/**
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers. Numbers are entered into the dataset using the
 * enter(double) method. Methods are provided to return the following statistics
 * for the set of numbers that have been entered: The number of items, the sum
 * of the items, the average, and the standard deviation
 */

public class StatCalc {

	private int count; // Number of numbers that have been entered.
	private double sum; // The sum of all the items that have been entered.
	private double squareSum; // The sum of the squares of all the items.
	private double[] enterArray = new double[0];
	private double maxEnter;
	private double minEnter;

	/**
	 * Add a number to the dataset. The statistics will be computed for all the
	 * numbers that have been added to the dataset using this method.
	 */
	public void enter(double num) {
		count++;
		sum += num;
		squareSum += num * num;
		enterArray = Arrays.copyOf(enterArray, enterArray.length + 1);
		enterArray[enterArray.length - 1] = num;

		if (num > maxEnter) {
			maxEnter = num;
		}
		if (num < maxEnter) {
			minEnter = num;
		}
	}

	/**
	 * Return the number of items that have been entered into the dataset.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Return the array of numbers that have been entered.
	 */
	public double[] getArray() {
		return enterArray;
	}

	/**
	 * Return the max number that have been entered.
	 */
	public double getMax() {
		return maxEnter;
	}

	/**
	 * Return the max number that have been entered.
	 */
	public double getMin() {
		return minEnter;
	}

	/**
	 * Return the sum of all the numbers that have been entered.
	 */
	public double getSum() {
		return sum;
	}

	/**
	 * Return the average of all the items that have been entered. The return value
	 * is Double.NaN if no numbers have been entered.
	 */
	public double getMean() {
		if (getCount() > 0) {
			return sum / count;
		} else {
			return 0;
		}
	}

	/**
	 * Return the standard deviation of all the items that have been entered. The
	 * return value is Double.NaN if no numbers have been entered.
	 */
	public double getStandardDeviation() {
		if (getCount() > 0) {
			double mean = getMean();
			return Math.sqrt(squareSum / count - mean * mean);
		} else {
			return 0;
		}
	}
} // end class StatCalc