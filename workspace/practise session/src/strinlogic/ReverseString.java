package strinlogic;

import java.util.Scanner;

public class ReverseString {
  
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a String to reverse");
		 String str = sc.nextLine();
		 String newS = "";
		 
		 for (int i = str.length()-1; i >= 0; i--) {
			newS+=str.charAt(i);
		}
		 System.out.println(newS);
	}
}
