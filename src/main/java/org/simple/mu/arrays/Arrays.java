package org.simple.mu.arrays;

/**
 * Array utility to add all the elements of the array.
 * 
 * @author Gagandeep Singh
 * @since 23-AUG-2017 1.0
 * @version 1.0
 */
public class Arrays {

	/**
	 * <p>
	 * Adds all the elements of the array and return the result.
	 * </p>
	 * 
	 * <pre>
	 * Arrays.add(new long[] { 2147483677L })              = 2147483677L;
	 * Arrays.add(new long[] { 2147483677L, 2147483659L }) = 4294967336L;
	 * Arrays.add(new long[] {})                           = 0L;
	 * </pre>
	 * 
	 * @param inputArray
	 *            the array of long elements to add.
	 * @return sum of all the elements
	 * @since 23-AUG-2017 1.0
	 * @version 1.0
	 */
	public static long add(long[] inputArray) {

		long result = 0L;
		for (long input : inputArray) {
			result += input;
		}
		return result;
	}

	/**
	 * <p>
	 * Adds all the elements of the array and return the result.
	 * </p>
	 * 
	 * <pre>
	 * Arrays.add(new long[] { 30 })     = 30;
	 * Arrays.add(new long[] { 30, 12 }) = 42;
	 * Arrays.add(new long[] {})         = 0;
	 * </pre>
	 * 
	 * @param inputArray
	 *            the array of int elements to add.
	 * @return sum of all the elements.
	 * @since 23-AUG-2017 1.0
	 * @version 1.0
	 */
	public static int add(int[] inputArray) {

		int result = 0;
		for (int input : inputArray) {
			result += input;
		}
		return result;
	}
}