package numbers_logic;

public class Reverse {
     public static void main(String[] args) {
		int no = 12321;
		int temp = no;
		int rev = 0;
		while(no!=0)
		{
			int rem = no%10;
			rev = rev*10 +rem;
			no=no/10;
		}
		//System.out.println(rev);
		if(temp==rev)
		{
			System.out.println(temp +" is palindrome");
		}
	}
}
