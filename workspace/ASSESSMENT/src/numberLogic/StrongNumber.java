package numberLogic;

public class StrongNumber {
public static void main(String[] args) {
	int num=145;
	int copy =num;
	int sum =0;
	while(num!=0){
		int d = num%10;
		sum=sum+fact(d);
		num=num/10;
	}
	if(copy==sum)
		System.out.println("strong number");
	else
		System.out.println("not a strong number");
}

private static int fact(int d) {
	int facto =  1;
	for (int i = d; i >=1; i--) {
		facto =facto*i;
	}
	return facto;
}
}
