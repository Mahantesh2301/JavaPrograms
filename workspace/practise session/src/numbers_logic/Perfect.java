package numbers_logic;

public class Perfect {
	public static void main(String[] args) {
		int no = 6;
		int sum = 0;

		for (int i = 1; i <= no / 2; i++) {
			if (no % i == 0) {
				sum = sum + i;
			}
		}
		if (no == sum) {
			System.out.println(no + " is perfect number");
		}
	}
}
