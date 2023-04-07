package numberLogic;

public class FindSqrt {
  public static void main(String[] args) {
	int num =144;
	int low =1;
	int high= num/2;
	
	while(low<=high){
		int mid = low+high/2;
		if(mid*mid ==num ){
			System.out.println(mid);
			break;
		}else if(mid*mid>num){
			high=mid-1;
		}else{
			low = mid+1;
		}
	}
}
}
