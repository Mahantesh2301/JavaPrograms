package numberLogic;

import java.util.Scanner;

public class OddNumBwRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give start range");
		int s = sc.nextInt();
		System.out.println("give end range");
		int e = sc.nextInt();
		for (int i = s; i <= e; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
