package numbers_logic;

public class Power {
     public static void main(String[] args) {
		int base = 2;
		int exp = 3;
		int res=1;
		for(int i = exp; i>=1; i--)
		{
			res = res*base;
		}
		System.out.println(res);
	}
}
