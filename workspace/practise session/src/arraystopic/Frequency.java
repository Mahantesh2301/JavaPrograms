package arraystopic;

import java.util.Arrays;

public class Frequency {
  public static void main(String[] args) {
	  int [] arr = {9,10,10,11,12,9,1,2,3,4,4,5,6,7,5};
	  int [] res = new int[arr.length];
	  for (int i = 0; i < arr.length; i++) {
		int count=1;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]){
				res[j]=-1;
				count++;
			}
			if(res[i]!=-1){
				res[i]=count;
			}
		}
	}
	  for (int i = 0; i < res.length; i++) {
		if(res[i]!=-1){
			System.out.println(arr[i]+" "+res[i]);
		}
	}
//	  System.out.println(Arrays.toString(arr));
//	  System.out.println(Arrays.toString(res));
}  
}




