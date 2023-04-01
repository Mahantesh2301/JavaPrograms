package arraystopic;

public class MatrixMul {
  public static void main(String[] args) {
	  int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
		int[][] brr={{90,80,70},{60,50,40},{30,20,10}};
		
		int res[][] = new int[3][3];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				res[i][j]=arr[i][j]*brr[i][j];
			}
		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
}
}
