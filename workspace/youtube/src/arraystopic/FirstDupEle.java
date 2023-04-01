package arraystopic;

public class FirstDupEle {
	// to find the first duplicate occurence in an array.
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 1, 2, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					return;
				}
			}
		}
	}
}
