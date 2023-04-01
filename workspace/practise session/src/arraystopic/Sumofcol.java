package arraystopic;

import java.util.Arrays;

public class Sumofcol {
    public static void main(String[] args) {
    	int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
    	  
    	  
    	  int res[]= new int [3];
    	  for (int i = 0; i < res.length; i++) {
    		  int sum = 0;
			for (int j = 0; j < res.length; j++) {
				sum = sum+arr[j][i];
			}
			res[i]=sum;
		}
    	  System.out.println(Arrays.toString(res));
	}
}
