package strinlogic;

import java.util.Scanner;

public class CountSpa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine();
	 int space = 0;
	 for (int i = 0; i < str.length(); i++) {
		 char ch = str.charAt(i);
		if(ch==' '){
			space++;
		}
	}
	 System.out.println(space);
}
}
