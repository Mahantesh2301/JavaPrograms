package numbers_logic;

import java.util.Scanner;

public class Strong_number {
	
	static int fact(int d)
	{
		int facto =1;
		for (int i=d; i>=1; i--)
		{
			facto = facto*i;
		}
		return facto;
	}
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number to check strong number");
		int no = sc.nextInt();
		int temp = no;
		int sum = 0;
		while(no!=0)
		{
			int d = no%10;
			sum = sum+fact(d);
			no=no/10;
		}
		if(sum==temp)
		{
			System.out.println(temp +" is strong number");
		}
		else
		{
			System.out.println(temp +" is not strong number");
		}
		sc.close();
	}
}
