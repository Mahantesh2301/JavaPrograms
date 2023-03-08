package programming;

public class Rev_number {

	public static void main(String[] args) {
		String n = "7619109910";
		String rev = "";
		for(int i = n.length()-1; i>=0; i--)
		{
			//int rem = n%10;
			//rev = (rev*10) + rem;
			
			//n = n/10;
			rev = rev+n.charAt(i);
			
		}
            System.out.println(rev);
	}

}
