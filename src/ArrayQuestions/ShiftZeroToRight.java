package ArrayQuestions;

import java.util.Arrays;

public class ShiftZeroToRight {

	private static int[] shiftZeroToRight(int[] a) {

		if (a.length == 1) {
			return a;
		}
		int newArray[] = new int[a.length];
		int count = 0;
		for (int number : a) {
			if (number != 0) {// non zero numbers
				newArray[count] = number;
				count++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {

		// test cases:
		int[] i = new int[] { 1, 0, 20, 0, 3, 0, 0, 0, 1, 4, 90 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 0, 1, 0, 2, 0, 3, 0, 0, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 2, 3, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 0, 0, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 0, 2, 0, 3, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 1, 0, 1, 0, 1, 1 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 1, 1, 1 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

	}

}
