package arraystopic;

import java.util.Arrays;

public class Bigelecol {
  public static void main(String[] args) {
	  int[][] arr = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };
		int res[] = new int[3];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>arr[i+1][j]){
					int temp = arr[i][j];
					arr[i][j]=arr[i+1][j];
					arr[i+1][j]=temp;
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			int big = 0;
				big = arr[i][arr.length-1];
			res[i]=big;
		}
		System.out.println("biggest element in given array-->"+Arrays.toString(res));
}
	
}
