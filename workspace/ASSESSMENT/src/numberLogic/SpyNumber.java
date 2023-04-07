package numberLogic;

public class SpyNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int num = i;
			int copy = num;
			int sum = 0;
			int prod = 1;
			while (num != 0) {
				int d = num % 10;
				sum = sum + d;
				prod = prod * d;
				num = num / 10;
			}
			if (sum == prod) {
				System.out.println(copy + " spy number");
			} else {
				System.out.println(copy + " is not spy number");
			}
		}
	}
}
