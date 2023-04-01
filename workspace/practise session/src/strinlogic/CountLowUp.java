package strinlogic;

import java.util.Scanner;

public class CountLowUp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine();
	 
	 int spcl = 0;
	 int lower = 0;
	 
	 for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(ch>='a'&&ch<='z'){
			lower++;
		}else if(((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'))==false){
			spcl++;
		}
	}
	 System.out.println("lower case count--> "+lower);
	 System.out.println("special character count--> "+spcl);
}
}
