package dynamic_input;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter values integers only");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a+b+c);
      sc.close();
	} 
           
}
