package numberLogic;

public class PrimeNumber {
public static void main(String[] args) {
	int num =7;
	boolean flag = true;
	if(num<=1){
		System.out.println("not a prime number");
	}else{
		for (int i = 2; i <= num/2; i++) {
			if(num%i==0){
				flag=false;
				break;
			}
		}
	}
	if(flag){
		System.out.println("its a prime number");
	}else{
		System.out.println("not a prime number");
	}
}
}
