package numberLogic;

public class CountFactorsOfNum {
	public static void main(String[] args) {
		int n = 6;
		int count = 1;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
