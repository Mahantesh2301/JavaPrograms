package strinlogic;

import java.util.Scanner;

public class FrequencyofSub {
	static void frequency(String str, String word) {
		String[] arr = str.split(" ");
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < res.length; j++) {
				if (arr[i].equals(arr[j]) && res[i] != -1) {
					res[j] = -1;
					count++;
				}
				if (res[i] != -1)
					res[i] = count;
			}
		}
		for (int j = 0; j < res.length; j++) {
			if (res[j] != -1 && arr[j].equals(word)) {
				System.out.println(res[j] + " " + arr[j]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
		System.out.println("enter a substring to check occurance");
		String word = sc.next();
		frequency(str, word);
	}
}
