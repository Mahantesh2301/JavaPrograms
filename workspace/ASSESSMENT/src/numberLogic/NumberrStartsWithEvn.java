package numberLogic;

public class NumberrStartsWithEvn {
	public static void main(String[] args) {
		int num = 8315;
		while (num > 9) {
			num = num / 10;
		}
		if (num % 2 == 0) {
			System.out.println("starts with even");
		} else {
			System.out.println("not starts with even");
		}
	}
}
