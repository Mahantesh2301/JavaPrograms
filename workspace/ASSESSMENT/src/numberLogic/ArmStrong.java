package numberLogic;
public class ArmStrong {
	public static void main(String[] args) {
		int num = 123;
		int copy = num;
		int temp = num;
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 2;
		}
		int sum = 0;
		while (copy != 0) {
			int d = copy % 10;
			sum = sum + cube(d, count);
			copy = copy / 10;
		}
		if (sum == temp)
			System.out.println("armstrong number");
		else
			System.out.println("not a armstrong number");
	}

	private static int cube(int d, int count) {
		int fact = 1;
		for (int i = 1; i <= count; i++) {
			fact = fact * d;
		}
		return fact;
	}
}
