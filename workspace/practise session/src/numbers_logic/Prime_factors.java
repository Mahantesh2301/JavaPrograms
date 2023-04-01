package numbers_logic;

public class Prime_factors {
	public static void main(String[] args) {

		int no = 30;
		for (int i = 1; i <= no / 2; i++) {
			if (no % i == 0) {
				prime(i);
			}
		}
	}

	private static void prime(int i) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for (int j =1 ; j<=i/2; j++)
		{
			if(i%j==0 && j!=1)
			{
				flag=false;
				break;
			}
		}
		if(flag==true && i!=1)
		{
			System.out.println(i +" is prime factor");
		}else
		{
			System.out.println(i+" is not prime factor");
		}
	}
}
