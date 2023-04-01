package arraystopic;

public class Maxin2d {
  public static void main(String[] args) {
	  int[][] arr = { { 1, 50, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };
	  
	  for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length-1; j++) {
			if (arr[j][i] > arr[j + 1][i]) {
				int temp = arr[j][i];
				arr[j][i] = arr[j + 1][i];
				arr[j + 1][i] = temp;
			}
		}
	}
	  for (int i = 0; i < arr.length-1; i++) {
		if(arr[arr.length-1][i]>arr[arr.length-1][i+1]){
			int temp = arr[arr.length-1][i];
			arr[arr.length-1][i]=arr[arr.length-1][i+1];
			arr[arr.length-1][i+1]=temp;
		}
	}
	  System.out.println("biggest element of given 2d array is-->"+arr[arr.length-1][arr.length-1]);
}
}
