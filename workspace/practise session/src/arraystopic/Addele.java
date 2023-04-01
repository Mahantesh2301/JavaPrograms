package arraystopic;

import java.util.Arrays;
import java.util.Scanner;

public class Addele {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter array size");
	  int size = sc.nextInt();
	  int[] arr = new int[size];
	  System.out.println("enter array elements");
	   for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	   System.out.println("your array elements are--->"+Arrays.toString(arr));
	   
	   System.out.println("enter element to be added");
	   int element = sc.nextInt();
	   System.out.println("enter index where element should be added");
	   int ind = sc.nextInt();
	   int[] abb = new int[arr.length+1];
	   int x = 0;
	   for (int i = 0; i < abb.length; i++) {
		if(i==ind){
			abb[i]=element;
			
		}else{
			abb[i]=arr[x];
			x++;
		}
	}
	 System.out.println("your updated array elements are-->" + Arrays.toString(abb)); 
	   
}
}
