package arraystopic;

import java.util.Random;

public class CheckPowOf2 {
  public static void main(String[] args) {
	Random r = new Random();
	int num = r.nextInt(1);
	System.out.println(num);
	if(num<=0){
		System.out.println("not a power of 2");
	}
	while(num%2==0){
		num=num/2;
	}
	if(num==1){
		System.out.println("power of 2");
	}else{
		System.out.println("not a power of 2");
	}
}
}
