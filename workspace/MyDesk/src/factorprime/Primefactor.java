package factorprime;

public class Primefactor {
	
	static void prime(int i)
	{
		boolean flag = true;
		for(int j =2; j<=i/2;j++)
		{
			
			if(i%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true && i!=1)
		{
			System.out.println(i +" is prime factor");
		}
	}
	public static void main(String[] args) {
		int num = 10;
		for(int i =1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				prime(i);
			}
		}
	}

}
