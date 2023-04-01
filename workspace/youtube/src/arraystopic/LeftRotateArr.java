package arraystopic;

import java.util.Arrays;

public class LeftRotateArr {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 3;
		int res[] = new int[arr.length];
		int x = 0;
		for (int i = n; i < arr.length; i++) {
			res[x] = arr[i];
			x++;
		}
		for (int i = 0; i < n; i++) {
			res[x] = arr[i];
			x++;
		}
		System.out.println(Arrays.toString(res));
	}
}
