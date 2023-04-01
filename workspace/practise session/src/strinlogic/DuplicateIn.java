package strinlogic;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateIn {

	static void dup(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != '0') {
					ch[j] = '0';
				}
			}
			if(ch[i] != '0')
			System.out.println(ch[i]);
		}
	}
	
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	     System.out.println("enter a String");
	     String str = sc.nextLine();
	     dup(str);
	}
}
