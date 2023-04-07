package numberLogic;

public class Automorphic {
	public static void main(String[] args) {
		int num = 6;
		int sqr = num * num;
		boolean flag= true;
       while(num!=0 && sqr!=0){
    	   if(num%10 != sqr%10){
    		   flag = false;
    	   }
    	   num=num/10; sqr = sqr/10;
       }
       if(flag){
    	   System.out.println("its Automorphic number");
       }else{
    	   System.out.println("not a automorphic number");
       }
	}
}
