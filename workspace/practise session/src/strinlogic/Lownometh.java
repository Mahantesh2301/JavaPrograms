package strinlogic;

import java.util.Scanner;

public class Lownometh {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine();
	 String strN ="";
	 
	 for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(ch>='A'&&ch<='Z'){
			int no = (int)ch+32;
			  ch = (char)no;
			strN+=ch;
		}else{
			strN+=ch;
		}
	}
	 System.out.println(strN);
}
}
