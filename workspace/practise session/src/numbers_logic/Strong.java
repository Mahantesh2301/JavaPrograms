package numbers_logic;

import java.util.Scanner;

public class Strong {
     public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check wheather strong number or not");
		int no = sc.nextInt();
		int temp =no;
		int res = 0;
		while(no!=0)
		{
			int rem = no%10;
			res = factorial(rem)+res;
			no = no/10;
		}
		//System.out.println(res);
		if(temp==res)
		{
			System.out.println(temp+" is strong number");
		}
	}

	private static int factorial(int rem) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i = rem; i>=1; i--)
		{
			fact = fact*i;
		}
		return fact;
		
	}
	
}
