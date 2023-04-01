package strinlogic;

import java.util.Scanner;

public class StringTask1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter two Strings (==)");
	 String s1 = sc.nextLine();
	 String s2 =sc.nextLine();
	 System.out.println(s1==s2);
	 System.out.println("******************************");
	 System.out.println("enter two Strings (equals())");
	 String s3 =sc.nextLine();
	 String s4 =sc.nextLine();
	 System.out.println(s3.equals(s4));
	 System.out.println("******************************");
	 System.out.println("enter two Strings (compareTo)");
	 String s5 =sc.nextLine();
	 String s6 =sc.nextLine();
	 System.out.println(s3.compareTo(s6));
	 System.out.println("******************************");
	 System.out.println("enter two Strings (equalsignorecase)");
	 String s7 =sc.nextLine();
	 String s8 =sc.nextLine();
	 System.out.println(s7.equalsIgnoreCase(s8));
	 System.out.println("******************************");
//	 String s9 = "mahan";
//	 String s10  ="mahan";
//	 System.out.println(s9==s10);
}
}
