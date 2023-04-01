package strinlogic;

import java.util.Scanner;

public class ValidMail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mail id to check");
		String mail = sc.nextLine();
		int count = 0;
		char ch1 = mail.charAt(0);
		if (ch1>='a' && ch1<='z') {

			for (int i = 0; i < mail.length(); i++) {
				char ch = mail.charAt(i);
				if (ch == '@' || ch == '.') {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("valid mail");
			} else {
				System.out.println("not a valid mail");
			}
		}else{
			System.out.println("not a valid mail");
		}
	}
}
