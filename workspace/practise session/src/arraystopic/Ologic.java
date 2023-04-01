package arraystopic;

public class Ologic {
  public static void main(String[] args) {
	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(i==arr.length/2 && j==arr.length/2){
				System.out.print(arr[i][j]+" ");
			}else{
				System.out.print("0 ");
			}
		}
		System.out.println();
	}
}
}
