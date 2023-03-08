package arrayy;

import java.util.Scanner;

public class Dynamic {
  public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the array size");
	    int size = sc.nextInt();
	    int[] arr = new int[size];
         
	    //this forloop for inserting array elements
	    System.out.println("enter array elements");
	    
	    for (int i=0; i <arr.length; i++ )
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    //this forloop for printing array elements
	    System.out.println("your array elements are");
	    for(int i = 0; i<arr.length; i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    sc.close();
}
}
