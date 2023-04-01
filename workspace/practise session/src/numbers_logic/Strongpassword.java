package numbers_logic;

import java.util.Scanner;

public class Strongpassword {
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter password");
	String str = sc.nextLine();
	
		if(str.charAt(0)=='@')
		{
	int countlow = 0;
	int countspcl = 0;
	int countnum = 0;
	int countup = 0;
			
			
			for(int i = 1; i<str.length();i++)
			{
				char ch = str.charAt(i);
				
				if(ch !=' '){
					
				if(ch>='A'&&ch<='Z')
				{
					countup++;
				}
				
				else if(ch>='a'&&ch<='z')
				{
					countlow++;
				}
				
				else if(ch>='0'&&ch<='9')
				{
					countnum++;
				}
				
				
				else
				{
					countspcl++;				
				}
			}
		
		    else
		    {
				System.out.println("space not allowed");
		    }
		}
	
	
			if(countup>0 && countlow>=2 && countnum >0 && countspcl >=3)
			{
				System.out.println("strong");
			}
		}
		else {
			System.out.println("start with @");
		}
		
	}
}

	
	


