package arraystopic;

public class Sumof2darr {
  public static void main(String[] args) {
	 
	  int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
	  int [] [] brr = {{1,2,3},{4,5,6},{7,8,9}};
	  
	  int res[] []= new int [3][3];
	  
	  for (int i = 0; i < res.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			res[i][j] =arr[i][j]+brr[i][j]; 
		}
	}
	  for (int i = 0; i < res.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(res[i][j]+" ");
		}
		System.out.println();
	}
}
}
