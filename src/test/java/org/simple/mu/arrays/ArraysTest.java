package org.simple.mu.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArraysTest {

	@Test
	public void testAddForInt() {

		// -2147483648
		int smallest = Integer.MIN_VALUE;
		// 2147483647
		int largest = Integer.MAX_VALUE;

		int[] inputArray = { 30 };
		Assert.assertTrue("", Arrays.add(inputArray) == 30);

		int[] inputArray2 = { 30, 12 };
		Assert.assertTrue("", Arrays.add(inputArray2) == 42);

		int[] inputArray3 = { 30, 12, 34, -35, -10, 37 };
		Assert.assertTrue("", Arrays.add(inputArray3) == 68);

		int[] inputArray4 = {};
		Assert.assertTrue("", Arrays.add(inputArray4) == 0);

		int[] inputArray5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
				52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
				78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
		Assert.assertTrue("", Arrays.add(inputArray5) == 5050);

		int[] inputArray6 = { smallest };
		Assert.assertTrue("", Arrays.add(inputArray6) == smallest);

		int[] inputArray7 = { smallest - 1 };
		Assert.assertTrue("", Arrays.add(inputArray7) == largest);

		int[] inputArray8 = { largest };
		Assert.assertTrue("", Arrays.add(inputArray8) == largest);

		int[] inputArray9 = { largest + 1 };
		Assert.assertTrue("", Arrays.add(inputArray9) == smallest);
	}

	@Test
	public void testAddForLong() {

		// -9223372036854775808
		long smallest = Long.MIN_VALUE;
		// 9223372036854775807
		long largest = Long.MAX_VALUE;

		long[] inputArray = { 2147483677L };
		Assert.assertTrue("", Arrays.add(inputArray) == 2147483677L);

		long[] inputArray2 = { 2147483677L, 2147483659L };
		Assert.assertTrue("", Arrays.add(inputArray2) == 4294967336L);

		long[] inputArray3 = { 2147483677L, 2147483659L, 34, -35, -10, 37 };
		Assert.assertTrue("", Arrays.add(inputArray3) == 4294967362L);

		long[] inputArray4 = {};
		Assert.assertTrue("", Arrays.add(inputArray4) == 0);

		long[] inputArray5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2147483659L, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
				23, 24, 25, 26, 27, 28, 29, 2147483677L, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
				47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72,
				73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98,
				99, 100 };
		Assert.assertTrue("", Arrays.add(inputArray5) == 4294972344L);

		long[] inputArray6 = { smallest };
		Assert.assertTrue("", Arrays.add(inputArray6) == smallest);

		long[] inputArray7 = { smallest - 1 };
		Assert.assertTrue("", Arrays.add(inputArray7) == largest);

		long[] inputArray8 = { largest };
		Assert.assertTrue("", Arrays.add(inputArray8) == largest);

		long[] inputArray9 = { largest + 1 };
		Assert.assertTrue("", Arrays.add(inputArray9) == smallest);

	}
}