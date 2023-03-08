package arrayy;

public class Iteration {
	
	static void back (int[] arr)
	{
		for(int i = 0 ; i<arr.length;i++)
		{
			int sum=0;
			int no = arr[i];
			while(no!=0)
			{
				int rem = no%10;
				
				sum = sum+rem;
				no = no/10;
			}
			//System.out.println(sum);
			while(arr[i]<9)
			{
				
			   int rem = sum%10;
			   sum = sum+rem;
			   arr[i] = sum/10;
			   
			}
			System.out.println(sum);
		}
		
	}
public static void main(String[] args) {
	int[] arr = {1234,4557,4657};
            
      
      
    	  
      back(arr);
	
	
	
		
	}
}

