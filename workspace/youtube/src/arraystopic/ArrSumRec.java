package arraystopic;

public class ArrSumRec {
  public static void main(String[] args) {
	int [] arr = {1,2,5,4,3};
	int sum = calSum(arr , arr.length-1);
	System.out.println(sum);
}

private static int calSum(int[] arr, int n) {
	if(n<0){
	return 0;
	}
	return arr[n]+calSum(arr , n-1);
}
}
