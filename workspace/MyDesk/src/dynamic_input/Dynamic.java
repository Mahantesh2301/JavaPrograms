package dynamic_input;

import java.util.Scanner;

public class Dynamic {
	static void name (String a)
	{
		
		String same = "";
		for(int i =(a.length()-1 ) -(a.length()-1) ; i<=a.length()-1 ; i++ )
		{
			same =same + a.charAt(i);
		}
		System.out.println(same);
	}
	public static void main(String[] args) {
		System.out.println("enter any string");
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        name (a);
        sc.close();
	}

}
