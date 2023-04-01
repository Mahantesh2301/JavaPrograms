package arraystopic;

import java.util.Arrays;

public class RightRotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 3;
		int res[] = new int[arr.length];
		int x = 0;
		for (int i = arr.length - n; i < res.length; i++) {
			res[x] = arr[i];
			x++;
		}
		for (int i = 0; i < arr.length - n; i++) {
			res[x] = arr[i];
			x++;
		}
		System.out.println(Arrays.toString(res));
	}
}
