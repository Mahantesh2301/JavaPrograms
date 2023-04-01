package arraystopic;

public class Recursionsum {
	static int recur(int n){
		if(n<=1){
		return n;
		}else{
		 n =n+recur(n-1);
		 return n;
		}
	}
   public static void main(String[] args) {
	   int n = 5;
	   System.out.println(recur(n));
	}
}

