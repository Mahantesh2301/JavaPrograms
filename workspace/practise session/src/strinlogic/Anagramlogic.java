package strinlogic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramlogic {
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() == s2.length()) {	
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag = true;
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.nextLine();
		System.out.println("enter a second String");
		String s2 = sc.nextLine();
		System.out.println(isAnagram(s1, s2));

	}
}
