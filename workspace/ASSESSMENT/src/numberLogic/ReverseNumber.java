package numberLogic;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = 123;
		int rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		System.out.println(rev);
	}
}
