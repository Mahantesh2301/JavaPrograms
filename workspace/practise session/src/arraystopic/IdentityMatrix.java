package arraystopic;

import java.util.Scanner;

public class IdentityMatrix {
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
	int count =0;
	int countnum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==1 && i==j){
		             count++;			
				}
				else if(arr[i][j]==0) {
					countnum++;
				}else{
					break;
				}
			}
		}
		if(csize == rsize && count==arr.length && countnum==csize){
			System.out.println("it is a identity matrix");
		}else{
			System.out.println("it is not an identity matrix");
		}
}
}
