package arraystopic;

public class NxtGrtEle {
	public static void main(String[] args) {
		// Java Program to find next greater element in array in java?
		int[] a = { 11, 21, 13, 10, 15 };
		for (int i = 0; i < a.length; i++) {
			int next = -1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					next = a[j];
					// break;
				}
			}
			System.out.println(a[i] + " ," + next);
		}
	}
}
