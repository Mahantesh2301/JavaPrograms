package leapyear;

public class Leap {
public static void main(String[] args) {
	for (int i= 1; i<=1000;i++)
	{
		if(i%400==0)
		{
			System.out.println(i+" is leap year");
		}
		else if(i%4==0 && i%100!=0 )
		{
			System.out.println(i +" is leap year");
		}
//		else
//		{
//			System.out.println(i +" is not leap year");
//		}
	}
}
}
