package arraystopic;

import java.util.Arrays;

public class Leftrotate {
  public static void main(String[] args) {
	  int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int []brr = new int [arr.length];
		int x = 0;
		int n = 3;
		for (int i = n; i<arr.length; i++){
			brr[x]=arr[i];
			x++;
		}
		for (int i = 0; i < n; i++) {
			brr[x]=arr[i];
			x++;
		}
		System.out.println(Arrays.toString(brr));
}
}
