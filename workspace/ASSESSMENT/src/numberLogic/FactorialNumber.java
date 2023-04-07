package numberLogic;

public class FactorialNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+" "+ facto(i));
		}
	}

	static int facto(int i) {
		int fact = 1;
		for (int j = i; j >= 1; j--) {
			fact = fact * j;
		}
		return fact;
	}
}
