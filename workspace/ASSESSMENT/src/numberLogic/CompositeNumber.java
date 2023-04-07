package numberLogic;

public class CompositeNumber {
	public static void main(String[] args) {
		int num = 2;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("composite number");
		} else {
			System.out.println("not a composite number");
		}
	}
}
