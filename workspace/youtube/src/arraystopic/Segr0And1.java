package arraystopic;

public class Segr0And1 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 0, 4, 5 };
		int[] b = new int[a.length];
		rearrange(a, b);
		print(b);
	}

	private static void print(int[] b) {
		for (int i : b) {
			System.out.print(i + " ");
			System.setIn(null);

		}
	}

	private static void rearrange(int[] a, int[] b) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (a[i] == 0) {
				b[j] = a[i];
				j++;
			}
		}
	}

}
