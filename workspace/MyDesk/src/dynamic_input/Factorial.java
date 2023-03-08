package dynamic_input;

import java.util.Scanner;

public class Factorial {
  static int fact(int a)
  {
	  int mul = 1;
	  for(int i = a; i>=1;i--)
	  {
		  
		  mul = mul*i;
	  }
	  return mul;
  }
  public static void main(String[] args) {
	  System.out.println("enter integer to find its factorial");
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int x =fact(a);
	  System.out.println(x + " is the factorial of " + a);
	  //System.out.println(fact(sc.nextInt()) + "is the factorial of + );
	  sc.close();
}
}
