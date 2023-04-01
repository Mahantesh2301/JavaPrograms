package strinlogic;

import java.util.Arrays;
import java.util.Scanner;

public class Initcap {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
 		System.out.println("enter a string");
 		String s1 = sc.nextLine();	
 	     char arr [] = s1.toCharArray();
 	     
 	    char ch = (char)(arr[0]-32);
 	    arr[0]=ch;
 	
 	    for (int i = 1; i < arr.length; i++) {
			if(arr[i]==' '){
			 	    char ch1 = (char)(arr[i+1]-32);
			 	    arr[i+1]=ch1;
			}
		}
 	  String res = new String(arr);
 	  System.out.println(arr);
	}
}
