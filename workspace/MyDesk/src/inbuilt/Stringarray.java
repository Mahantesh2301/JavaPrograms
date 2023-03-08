package inbuilt;

public class Stringarray {
	public static void main(String[] args) {
		String str = "yellidde illi yellidde";
		String[] arr = str.split(" ");
		
		String rev = "";
		for (int  i = (arr.length-1 );i>=0;i--)
		{
//			if(i==0)
//			{
//				rev = rev+arr[i];
//			}
//			else
//			{
//				rev=rev+arr[i]+" ";
//			}
		   rev = rev+arr[i]+" ";
		   
		}
		System.out.println(rev);
//		if(str.equals(arr))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not");
//		}
	}

}
