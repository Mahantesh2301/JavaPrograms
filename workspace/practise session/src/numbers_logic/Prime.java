package numbers_logic;

public class Prime {
  public static void main(String[] args) {
	for(int j = 1 ; j<=100; j++)
	{
	boolean flag = true;
	for(int i = 1; i<=j/2;i++)
	{
		if(j%i==0 && i!=1)
		{
			flag = false;
			break;
		}
	}
	if(flag==true && j!=1)
	{
		System.out.print(j +",");
	}
	
	}
}
}
