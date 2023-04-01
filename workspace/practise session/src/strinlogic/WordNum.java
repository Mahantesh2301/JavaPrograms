package strinlogic;

import java.util.Scanner;

public class WordNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String");
	String str = sc.nextLine().toLowerCase();
	
	char[] str1= str.toCharArray();
	
	for (int i = 0; i < str1.length; i++) {
		int count =1;
		for (int j = i+1; j < str1.length; j++) {
			if(str1[i]==str1[j] && str1[i]!='0'){
				count++;
				str1[j]='0';
			}			
			}
		if(str1[i]!='0')
			System.out.print(str1[i]+""+count);
		}
	}
}

