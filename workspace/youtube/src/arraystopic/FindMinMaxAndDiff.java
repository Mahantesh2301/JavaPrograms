package arraystopic;

import java.util.Scanner;

public class FindMinMaxAndDiff {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		System.out.println("min value is " + min);
		System.out.println("max value is " + max);
		System.out.println("Maximum difference is " + (min - max));
	}

}
