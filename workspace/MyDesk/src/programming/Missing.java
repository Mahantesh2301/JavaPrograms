package programming;

public class Missing {
public static void main(String[] args) {
	
	int [] arr = {1,2,3,4,5,7,8,9,10};
	
	int actualsum = (10*11)/2; 
	
	int sum = 0;
	for (int i = 0; i<arr.length; i++)
	{
		sum = sum+arr[i];
		
		
	}
	
	System.out.println((actualsum-sum) +" is the missing number");
}
}
