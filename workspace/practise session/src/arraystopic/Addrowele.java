package arraystopic;

import java.util.Arrays;

public class Addrowele {
    public static void main(String[] args) {
    	int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
  	  
  	  
  	  int res[]= new int [3];
  	  
  	  for (int i = 0; i < arr.length; i++) {
  		  int sum = 0;
		for (int j = 0; j < arr[i].length; j++) {
			sum = sum+arr[i][j];
		}
		res[i]=sum;
	}
  	  System.out.println(Arrays.toString(res));
	}
}
