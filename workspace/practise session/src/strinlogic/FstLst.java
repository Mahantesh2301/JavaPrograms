package strinlogic;

import java.util.Scanner;

public class FstLst {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine();
	 
	 System.out.println(str.charAt(0)+","+str.charAt(str.length()-1));
}
}
