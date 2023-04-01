package strinlogic;

import java.util.Scanner;

public class EvenindCh {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine();
	 for (int i = 0; i < str.length(); i++) {
		 char ch = str.charAt(i);
		if(i%2==0){
			if(str.length()-1==i  || str.length()-2==i)
			System.out.print(ch);
		else
		System.out.print(ch+",");
		}
	}
}
}
