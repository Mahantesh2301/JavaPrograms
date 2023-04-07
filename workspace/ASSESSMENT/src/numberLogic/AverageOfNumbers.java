package numberLogic;

public class AverageOfNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int n = 10;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		int avg = sum / n;
		System.out.println(avg);
	}
}
