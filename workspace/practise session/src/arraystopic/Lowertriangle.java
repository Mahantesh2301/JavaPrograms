package arraystopic;

import java.util.Scanner;

public class Lowertriangle {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("enter 2d array row length");
		int rsize = sc.nextInt();
		System.out.println("enter 2d array column length");
		int csize = sc.nextInt();
		int[][] arr = new int[rsize][csize];
		System.out.println("enter an array elements");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("array elements are");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("lower triangle");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==arr.length-1||j==0||i==j) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
}
}
