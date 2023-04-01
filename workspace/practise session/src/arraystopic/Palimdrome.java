package arraystopic;

import java.util.Scanner;

public class Palimdrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine().toLowerCase();
		// char[] strc = str.toCharArray();
		boolean flag = true;
		int x = 0;
		int y = str.length() - 1;

		while (x < str.length()) {
			if (str.charAt(x) != str.charAt(y)) {
				flag = false;
			}
			x++;
			y--;
		}
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
