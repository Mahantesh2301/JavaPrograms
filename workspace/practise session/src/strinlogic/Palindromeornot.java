package strinlogic;

import java.util.Scanner;

public class Palindromeornot {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a String to check palindrome or not");
		 String str = sc.nextLine().toLowerCase();
		 boolean flag = true;
		 for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				flag = false;
				break;
			}
		}
		 if(flag){
			 System.out.println("true");
		 }else{
			 System.out.println("false");
		 }
}
}
