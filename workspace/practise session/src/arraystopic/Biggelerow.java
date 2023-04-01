package arraystopic;
import java.util.Arrays;
public class Biggelerow {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };
		int res[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[j][i] > arr[j + 1][i]) {
					int temp = arr[j][i];
					arr[j][i] = arr[j + 1][i];
					arr[j + 1][i] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int big = 0;			
				big = arr[arr.length - 1][i];
			res[i] = big;
		}
		System.out.println("Biggest element of each  row-->"+Arrays.toString(res));
	}
}
