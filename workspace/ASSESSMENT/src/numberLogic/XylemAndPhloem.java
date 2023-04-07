package numberLogic;

public class XylemAndPhloem {
	public static void main(String[] args) {
		int num = 121;
		int oSum = 0;
		int iSum = 0;
		oSum = oSum + (num % 10);
		num = num / 10;
		while (num > 9) {
			int d = num % 10;
			iSum = iSum + d;
			num = num / 10;
		}
		oSum = num + oSum;
		if (oSum == iSum) {
			System.out.println("xylem number");
		} else {
			System.out.println("phloem number");
		}
	}
}
