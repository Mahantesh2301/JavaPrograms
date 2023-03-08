package programming;

public class Rev_para {
	
	static void number (double n , double rev)
	{
		while (n!=0.0d)
		{
			double rem = n%10.0d;
			rev = (rev*10.0d)+rem;
			n = n/10.0d;
			
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		
		number(7619109910.0d, 0.0d);
		
	}
	

}
