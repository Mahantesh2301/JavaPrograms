package palindrome;

//import java.util.Scanner;

public class Rangeofpalindrome {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		for(int i =100; i<=110;i++)
		{
			//int n = sc.nextInt();
			int rev = 0;
			int temp = i;
			while(i!=0)
			{
				int rem = i%10;
				rev= (rev*10)+rem;
				i=i/10;
			}
//			System.out.println(rev);
//			System.out.println(temp);
			if (temp==rev)
			{
				System.out.println(rev +" is palindrome");
			}
		}
		//sc.close();
	}

}
