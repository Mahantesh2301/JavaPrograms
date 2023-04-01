package arraystopic;

import java.util.Arrays;
import java.util.Scanner;

public class Removeele {
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
		   
//		   System.out.println("enter element to be removed");
//		   int element = sc.nextInt();
		   System.out.println("enter index where element should be removed");
		   int ind = sc.nextInt();
		   int[] abb = new int[arr.length];
		   int x = 0;
		   for (int i = 0; i < arr.length; i++) {
			if(i==ind){
			}else{
				abb[x]=arr[i];
				x++;
			}
		}
		 System.out.println("your updated array elements are-->" + Arrays.toString(abb)); 
}
}
