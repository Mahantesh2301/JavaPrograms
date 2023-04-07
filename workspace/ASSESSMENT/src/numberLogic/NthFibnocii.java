package numberLogic;

public class NthFibnocii {
	public static void main(String[] args) {
		int nth = 10;
		int a = 0;
		int b = 1;
		for (int i = 1; i <= nth; i++) {
			int c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
	}
}
