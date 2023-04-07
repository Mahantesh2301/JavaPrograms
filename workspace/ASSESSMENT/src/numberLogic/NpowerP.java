package numberLogic;

public class NpowerP {
	public static void main(String[] args) {
		int base = 2;
		int res = 1;
		int pow = 2;
		while (pow != 0) {
			res = res * base;
			pow--;
		}
		System.out.println(res);
	}
}
