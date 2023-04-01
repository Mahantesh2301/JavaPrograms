package arraystopic;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonEle {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 10, 4, 5, 8, 50, 80, 90 };
		int[] arr2 = { 1, 2, 3, 10, 5, 20, 10, 50, 70, 59 };
		int[] arr3 = { 1, 2, 3, 4, 5, 20, 51, 38, 63, 50, 69, 10 };
		Set s = new LinkedHashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					for (int j2 = 0; j2 < arr3.length; j2++) {
						if (arr1[i] == arr3[j2]) {
							s.add(arr1[i]);
						}
					}
				}

			}
		}
		System.out.println(s);
	}
}
