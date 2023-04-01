package numbers_logic;

public class Happynumber {
	public static void main(String[] args) {
		int no = 13;

		while (no > 9) {
			int sum = 0;
			while (no != 0) {
				int rem = no % 10;
				sum = sum + rem * rem;
				no = no / 10;
			}
			no = sum;
		}
		// System.out.println(no);
		if (no == 1 || no == 7) {
			System.out.println(no + " is happy number");
		}
	}
}
