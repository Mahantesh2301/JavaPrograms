package strinlogic;

import java.util.Scanner;

public class PrintLenTim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter a String ");
		 String str = sc.nextLine();
		 
		 int n = str.length();
		 for (int i = n; i >=1 ; i--) {
			System.out.println(str);
		}
	}
}
