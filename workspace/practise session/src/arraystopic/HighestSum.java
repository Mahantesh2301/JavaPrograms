package arraystopic;

public class HighestSum {
  public static void main(String[] args) {
	int [] arr = {4,5,8,9,3,5};
	int max = 0;
	max  = arr[0]+arr[1];
	for (int i = 1; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			int sum = arr[i]+arr[j];
			if(max<sum){
				max = sum;
				
			}
		}
	}
	System.out.println(max);
}
}
