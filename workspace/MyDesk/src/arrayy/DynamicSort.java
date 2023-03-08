package arrayy;

import java.util.Arrays;
import java.util.Scanner;
public class DynamicSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements");
		for(int i = 0; i < arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//System.out.println("click 1 to sort array elements");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
		}
	
		
	}

