package numberLogic;

public class NeonNumber {
	public static void main(String[] args) {
		int num = 10;
		int sq = num * num;
		int sum = 0;
		while (sq != 0) {
			int d = sq % 10;
			sum = sum + d;
			sq = sq / 10;
		}
		if (sum == num) {
			System.out.println("neon number");
		} else {
			System.out.println("not a neon number");
		}
	}
}
