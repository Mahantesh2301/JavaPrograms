package arraystopic;

public class NegativeAtFirst {
	public static void main(String[] args) {
		// Java Program to move all negative numbers to the start of array and
		// positive numbers to end
		int a[] = { -1, 20, 30, -3, 40, -9 };
		int b[] = new int[a.length];
		rearrange(a, b);
		print(b);

	}

	private static void print(int[] b) {
		for (int i : b) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private static void rearrange(int[] a, int[] b) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				b[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[j] = a[i];
				j++;
			}
		}
	}

}
