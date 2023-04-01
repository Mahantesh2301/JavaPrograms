package arraystopic;
import java.util.Scanner;
public class SparseMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row length");
		int rsize = sc.nextInt();
		System.out.println("enter column length");
		int csize = sc.nextInt();
		int[][] arr = new int[rsize][csize];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("array elements are");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int num = 0;
		int zero = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != 0) {
					num++;
				} else {
					zero++;
				}
			}
		}
		if (zero > num) {
			System.out.println("it is a sparse matrix");
		} else {
			System.out.println("it is not a sparse matrix");
		}
	}
}
