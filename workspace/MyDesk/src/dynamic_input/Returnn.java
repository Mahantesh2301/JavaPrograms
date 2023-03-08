package dynamic_input;

import java.util.Scanner;

public class Returnn {
	static int add(int a , int b)
	{
		return (a+b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int x = add(a,b);
		System.out.println(x);
sc.close();
	}

}
