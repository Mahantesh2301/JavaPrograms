package strinlogic;

import java.util.Scanner;

public class WordsVowels {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a String ");
	 String str = sc.nextLine().toLowerCase();
	 
	 int count = 0;
	 char ch1 = str.charAt(0);
	 if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
		 count++;
	 }
	 
	 for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==' '){
			char ch  = str.charAt(i+1);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
		}
	}
	 System.out.println(count);
}
}
