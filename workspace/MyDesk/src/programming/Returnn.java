package programming;

public class Returnn {
	static String reverse (String str , String rev)
	{
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println(" palindrome");
		}
		else 
		{
			System.out.println(" not palindrome");
		}
		return rev;
	}

	public static void main(String[] args) {
		
           String x = reverse("amma", "");
   		System.out.println(x);

	}

}
