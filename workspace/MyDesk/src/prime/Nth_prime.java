package prime;

import java.util.Scanner;

public class Nth_prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Nth value");
		int n = sc.nextInt();
		int count = 0;
//		boolean flag = true;
		for (int num = 1; num <= 100; num++) {
			boolean flag = true;
			if(num==1)
			{
				continue;
			}
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}

			}
			if (flag == true) {
				
				count++;
				if (count == n) {
					System.out.println(num + " is " + n + "th prime number");
				}

			}
		}
		sc.close();
	}

}
