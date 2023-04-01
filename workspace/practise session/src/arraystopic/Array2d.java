package arraystopic;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter number of arrays to be created");
	  int rsize = sc.nextInt();
	  System.out.println("enter number of columns should be present in each array");
	  int csize = sc.nextInt();
	  int [][] arr = new int[rsize][csize];
	  for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("enter array elements for row-->"+(i+1));
			arr[i][j]=sc.nextInt();
		}
	}
	  System.out.println("****your array elements are****");
	  for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}  
}
}
