package strinlogic;

import java.util.Scanner;

public class LenAndSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine();
	 System.out.println("enter another String");
	 String str2 = sc.nextLine();
	 
	 System.out.println("length of first String is--> "+str.length());
	 System.out.println("length of first String is--> "+str2.length());
	 System.out.println("sum of two String is--> "+(str.length()+str2.length()));
}
}
