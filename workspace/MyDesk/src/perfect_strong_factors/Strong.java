package perfect_strong_factors;

public class Strong {
public static void main(String[] args) {
	
	int num=145;
	int temp =num;
	int sum=0;
	while(num !=0)
	{
		int rem = num%10;
		int mul=1;
		for(int i = rem; i>=1 ;i--)
		{
			mul = mul*i;
		}
		sum=mul+sum;
		num=num/10;
	}
	if (sum==temp)
	{
		System.out.println(temp + " is a strong number");
	}
	else
	{
		System.out.println( temp +" is not strong number");
	}
}
}
