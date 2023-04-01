package arraystopic;

public class PrintArrUsiRec {
	
public static void main(String[] args) {
	int [] arr = {1,2,5,4,3};
	printArr(arr,0);
	
}

private static int[] printArr(int[] arr, int n) {
	if(n>=arr.length){
	return arr;
	}
	System.out.println(arr[n]);
	return printArr(arr,n+1);
}
}
