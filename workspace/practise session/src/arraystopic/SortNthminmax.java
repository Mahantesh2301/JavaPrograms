package arraystopic;

import java.util.Arrays;
import java.util.Scanner;

public class SortNthminmax {
  public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	  int [] arr ={1,2,5,7,6,4,9,8,2,1,4,6,3};
//	  System.out.println("enter element in the range of 1-9 to find in array");
//	  int find = sc.nextInt();
//	  
//		if(find > arr.length/2){
//			for (int i = arr.length/2; i < arr.length; i++) {
//			if(arr[i]==find){
//				System.out.println(find +" in "+ i +" index");
//			}
//		}
//	}else{
//		for (int i = 0; i < arr.length/2; i++) {
//			if(arr[i]==find){
//				System.out.println(find+" in "+i +" index");
//			}
//		}
//	}
	  
	  int [] arr = {1,2,1,1,2,3,4,5,6,7,8,8,9,7,9,9,7};
	  int count = 1;
	  int nthmax =1;
	  
	  for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]<arr[j]){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;	
			}			
		}
	}
	  System.out.println(Arrays.toString(arr));
	  for(int i = arr.length-1;i>=0; i-- ){		  
			if(arr[i]!=arr[i-1]){
			count++;
			}
			if(count == nthmax){
				System.out.println(arr[i-1]);
				break;
			}	
	  }	  	  
}
}
