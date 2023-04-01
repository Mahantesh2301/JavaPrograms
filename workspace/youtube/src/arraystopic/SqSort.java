package arraystopic;

public class SqSort {
	public static void main(String[] args) {
		// Java Program to square a sorted array of Positive and Negative
		// Numbers
		int[] a = { -6, -1, 2, 4, 5 };
		int sq[] = squareSorted(a);
		for (int i = 0; i < sq.length; i++) {
			System.out.println(sq[i]);
		}
	}

	private static int[] squareSorted(int[] a) {
		int sq[] = new int[a.length];
		int start = 0;
		int end = a.length - 1;
		int sqIndex = a.length - 1;
		while (start <= end) {
			if (a[start] * a[start] > a[end] * a[end]) {
				sq[sqIndex--] = a[start] * a[start];
				start++;
			} else {
				sq[sqIndex--] = a[end] * a[end];
				end--;
			}
		}
		return sq;
	}
}
