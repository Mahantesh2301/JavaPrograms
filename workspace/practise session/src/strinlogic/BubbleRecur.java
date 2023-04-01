package strinlogic;

public class BubbleRecur {
	static int i =0;
	static int j = 1;
   public static void main(String[] args) {
	
	   
	   int [] arr = {5,4,9,3,1};
	   sorting(arr);
}

private static void sorting(int[] arr) {
	   
	if(i<arr.length ){
		if(arr[i]>arr[j] && j<arr.length){
			int temp = arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
			j++;
			sorting(arr);
		}else{
			i++;
			j=1;
		sorting(arr);
		}
	}else{
		System.out.println(arr);
	}
}
   
}
