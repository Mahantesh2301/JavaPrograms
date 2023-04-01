package arraystopic;

public class RevArrUsiRec {
public static void main(String[] args) {
	int [] arr = {1,2,5,4,3};
	revArr(arr,arr.length-1);
}

private static int[] revArr(int[] arr, int i) {
	if(i<0){
		return arr;
	}
	System.out.println(arr[i]);
	return revArr(arr,i-1);
}
}
