package arraystopic;

import java.util.Arrays;

public class Removedup {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int []brr = new int [arr.length];
		int x = 0;
		int n = 4;
		for (int i = arr.length-n; i<arr.length; i++){
				brr[x]=arr[i];
				x++;
		}
		for (int i = 0; i < arr.length-n; i++) {
			brr[x]=arr[i];
			x++;
		}
		System.out.println(Arrays.toString(brr));
	}

}
