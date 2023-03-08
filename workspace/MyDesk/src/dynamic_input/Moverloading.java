package dynamic_input;

import java.util.Scanner;

public class Moverloading {
	void send (String a)
	{
		System.out.println(a);
	}
	void send (int b)
	{
		System.out.println(b);
	}
	/*void send (int b , String a)
	{
		System.out.println(b + a);
	}*/
	
	public static void main(String[] args) {
		
		Moverloading m1 = new Moverloading();
		Scanner sc = new Scanner(System.in);
		String a  = sc.nextLine();
		m1.send(a);
		///int b = sc.nextInt();
		//m1.send(b);
		sc.close();
		
	}
			
	

}
