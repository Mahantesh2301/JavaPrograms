package strinlogic;

import java.util.Scanner;

public class TwoSpali {
	public static void main(String[] args) {		
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String 1");
	 String str1 = sc.nextLine().toLowerCase();
	 System.out.println("enter a String 2");
	 String str2 = sc.nextLine().toLowerCase();
	 if(str1.equals(str2)){
		 System.out.println("true");
	 }else{
		 System.out.println("false");
	 }
	 	 
}
}
