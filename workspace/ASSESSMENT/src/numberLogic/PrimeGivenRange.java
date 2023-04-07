package numberLogic;

public class PrimeGivenRange {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int num = i;
			boolean flag = true;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag== true && num>1) {
				System.out.println(num + " its a prime number");
			} else {
				System.out.println(num + " not a prime number");
			}
		}
	}
}
