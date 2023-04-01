package patterrns;

public class Kshape {
	public static void main(String[] args) {
		
		int n = 5;
		int half = n/2;
		System.out.println(half);
		for (int i = n; i >= 1; i--) {
	
			for (int j = 1; j <= i; j++) {

				if (n >= half) {
					System.out.print("* ");
					n--;
				} else {
					System.out.print("* ");
					n++;
				}
			}
			System.out.println();
		}
	}
}
