package programming;

public class Program {
	

	public static void main(String[] args) {
		
		String str = "APPA";
		String rev = "";
		for(int i = str.length()-1 ; i >=0 ; i-- )
		{	
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);	
		
		if(str.equals(rev))
		{
			System.out.println("its palindrome");
			
		}
		else
			
			
			{
				System.out.println("its not palindrome");
			}
		}
				

	}


