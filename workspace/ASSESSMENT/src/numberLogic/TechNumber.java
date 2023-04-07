package numberLogic;

public class TechNumber {
public static void main(String[] args) {
	int num =2025;
	int copy =num;
	int count=0;
	while(num!=0){
		count++;
		num=num/10;
	}
	if(count%2==0){
		int pow=count/2;
		int d=1;
		for (int i = 1; i <= pow; i++) {
			d=d*10;
		}
		int last=copy%d;
		int fst=copy/d;
		int sum = last+fst;
		int sqr = sum*sum;
		if(sqr==copy){
			System.out.println("tech number");
		}else{
			System.out.println("not a tech number");
		}
		
	}
}
}
