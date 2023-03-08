package dynamic_input;

import java.util.Scanner;

public class Para {
	
	static void add(int a , int b , int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter values integers only");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int  b = sc.nextInt();
		int c = sc.nextInt();
		add(a , b, c);
        sc.close();
	}

}
