package prime;

public class Prime_number {

	public static void main(String[] args) {

		for (int num = 1; num <= 100; num++) {
			if (num == 1) {
				System.out.println(num + " is not prime number");
				continue;
			}
			boolean flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println(num + " prime number");
			} else {
				System.out.println(num + " not prime number");

			}

		}
	}

}
