package numberLogic;

public class DuckNumber {
public static void main(String[] args) {
	int num =0302;
	boolean flag = false;
	while(num>9){
		int d = num%10;
		if(d==0){
			flag=true;
			break;
		}
		num=num/10;
	}
	if(flag){
		System.out.println("its a duck number");
	}else{
		System.out.println("not a duck number");
	}
}
}
