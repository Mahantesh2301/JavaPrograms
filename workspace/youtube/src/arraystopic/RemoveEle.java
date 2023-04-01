package arraystopic;

import java.util.Arrays;

public class RemoveEle {
	public static void main(String[] args) {
		// delete element from array in java
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array " + Arrays.toString(a));
		int[] b = new int[a.length - 1];
		int ind = 2;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == ind) {
				continue;
			}
			b[k++] = a[i];

		}
		System.out.println("Updated Array is " + Arrays.toString(b));
	}
}
