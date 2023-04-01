package strinlogic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Nanagram {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	TreeSet alpha = new TreeSet();
	System.out.println("enter a string");
	String str = sc.nextLine().toLowerCase();
	char[] strc = str.toCharArray();
	
	for (int i = 0 ; i<strc.length; i++)
	{
		if(strc[i]>= 'a' && strc[i]<='z')
		{
			alpha.add(strc[i]);
		}
	}
	
			if(alpha.size()==26)
			{
				System.out.println("Panagram");
			}
			else{
				System.out.println("not a panagram");
 			}
			
}
}
