package arraystopic;

import java.util.Scanner;

	class Sub {
		static void number(int a, int b, int c) {
			System.out.println("**************");
			System.out.println(c + " tables");
			System.out.println("**************");
			while (a <= b) {
				System.out.println(c + "*" + a + "=" + c * a);
				a++;
			}

		}
	}


	public class Evenodd {
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
	        Scanner sc = new Scanner(System.in);
	        System.out.println("select range and number to print tables");
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        System.out.println("enter table to print");
	        int z = sc.nextInt();
	          Sub.number(x,y,z);
	          sc.close();
			
		}
}
