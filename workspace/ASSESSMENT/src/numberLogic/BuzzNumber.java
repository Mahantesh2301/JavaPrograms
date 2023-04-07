package numberLogic;

public class BuzzNumber {
	public static void main(String[] args) {
		int num = 7;
		if (num % 7 == 0 || num % 10 == 7) {
			System.out.println("buzz number");
		} else {
			System.out.println("not a buzz number");
		}

	}
}
