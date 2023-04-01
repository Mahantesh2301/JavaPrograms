package arraystopic;

public class BinarySearch {
   public static void main(String[] args) {
	
	   int [] arr = {1,2,3,4,5,6,7,8,9};
	   int find = 30;
	   int low = 0;
	   int high = arr.length-1;
	   int mid = low+high/2;
	   boolean flag = true;
	   while(low<=high){
		   if(find == arr[mid]){
			   System.out.println("found");
			   flag =false;
			   break;
		   }else if(find > arr[mid]){
			   low = mid+1;
			   mid = (low+high)/2;
			   high = high;
		   }else{
			   high = mid-1;
			   low = low;
			   mid = (low+high)/2;
			   }
		   }
		if(flag){
			System.out.println("not found");
		}
	   }
	   
}

