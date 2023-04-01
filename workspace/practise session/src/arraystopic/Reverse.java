package arraystopic;

import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
	
	  int [] arr = {1,2,3,4,5};
	  int[]brr = new int[arr.length];
	  for (int i = 0; i < arr.length; i++) {
		brr[i]=arr[arr.length-1-i];
	}
	  
	  System.out.println(Arrays.toString(brr));
}
}
