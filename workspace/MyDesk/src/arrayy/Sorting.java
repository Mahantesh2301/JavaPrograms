package arrayy;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int [] arr = {3,6,3,2,6,8,2,9,};
		Arrays.sort(arr);
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
