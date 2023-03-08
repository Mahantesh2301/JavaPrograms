package dynamic_input;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		int b=sc.nextInt();
		for(  int a = sc.nextInt(); a<=b; a++ )
		{
		System.out.println(a*a);
		}
 sc.close();
	}

}
