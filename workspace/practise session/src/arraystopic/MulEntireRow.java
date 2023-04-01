package arraystopic;

import java.util.Scanner;

public class MulEntireRow {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.println("enter row length");
		int rsize = sc.nextInt();
		System.out.println("enter column length");
		int csize = sc.nextInt();
		int[][] arr = new int[rsize][csize];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int[][] brr = new int[rsize][csize];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
	int [][] res = new int [rsize][csize];
	
	for (int i = 0; i < res.length; i++) {

		for (int j = 0; j < res[i].length; j++) {
			
			for (int k = 0; k < res[i].length; k++) {
				res[i][j] += arr[i][k]*brr[k][j];
			
			}
			
		}
		
	}
	
	
   for (int i = 0; i < res.length; i++) {
	for (int j = 0; j < res[i].length; j++) {
		System.out.print(res[i][j]+"  ");
	}
	System.out.println();
}	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
