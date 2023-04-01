package arraystopic;

import java.util.Scanner;

public class InsertEle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a elements");
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		System.out.println("Printig elements before insert");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("Enter the location we want to insert");

		int loca = scn.nextInt();
		System.out.println("Enter the value at which we want to insert");
		int val = scn.nextInt();

		for (int i = a.length - 1; i > loca; i--) {
			a[i] = a[i - 1];
		}
		a[loca] = val;
		for (int i : a) {
			System.out.println(i);
		}
	}

}
