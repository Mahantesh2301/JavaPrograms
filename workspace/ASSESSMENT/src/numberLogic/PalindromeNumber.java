package numberLogic;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n = 121;
		int copy = n;
		int rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		if (copy == rev) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not a palindrome number");
		}
	}
}
