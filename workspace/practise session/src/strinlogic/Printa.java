package strinlogic;

import java.util.Scanner;

public class Printa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine().toLowerCase();
	 
	 for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='a'){
			System.out.println(i);
		}
	}
}
}
