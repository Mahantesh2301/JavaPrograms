package arraystopic;

import java.util.Arrays;

public class GivenSum {
  public static void main(String[] args) {
	  int [ ]arr = {1,2,3,4,5,7};
	  int sum = 6;
	  for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]==sum-arr[i])
				System.out.println(arr[i]+" "+arr[j]);
		}
	
	}
	  int [ ]arr2 = {-1,-2,-3,4,5,7};
	  for (int i = 0; i < arr2.length; i++) {
		arr2[i]=arr2[i]*arr2[i];
	}
	  System.out.println(Arrays.toString(arr2));
}
}
