package arrayy;

public class Odd {
	static void back(int [] b)
	{
		for (int i = 0; i<b.length;i++)
		{
			if(b[i]%2!=0)
			{
				System.out.println(b[i]);
			}
		}
		
	}
  public static void main(String[] args)
				{
			          int[] arr = {1,2,3,4,5,6};
			          
			          back(arr);
			   
				}
	}
   

