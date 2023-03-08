package perfect_strong_factors;

public class Nth_strong {

	static int factorial(int d) {
		int mul = 1;
		for (int i = d; i >= 1; i--)
			mul = mul * i;
		return mul;
	}

	public static void main(String[] args) {
		int num = 145;

		int sum = 0;

		while (num != 0) {
			int fact = num % 10;

			sum = sum + factorial(fact);
			num = num / 10;
		}
		System.out.println(sum);

	}
}
