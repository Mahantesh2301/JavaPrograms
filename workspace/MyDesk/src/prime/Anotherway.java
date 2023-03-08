package prime;

public class Anotherway {
	
	static boolean back(int num)
	{
		if(num<2)
		{
			return false;
		}
		for(int i= 2; i<= num/2; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for(int num =1 ; num<=100; num++)
		{
			if(back(num)==true)
			{
				System.out.println(num + " is prime number");
			}
			else
			{
				System.out.println(num +" is not prime number");
			}
		}
	}

}
