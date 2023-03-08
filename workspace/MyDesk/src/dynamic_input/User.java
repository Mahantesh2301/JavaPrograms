package dynamic_input;

import java.util.Scanner;

public class User {
public static void main(String[] args) {
	System.out.println("Give String to find its length");
	Scanner sc = new Scanner(System.in);
	
        	String a = sc.nextLine();
        	System.out.println(a.length());
        	sc.close();
}
}
