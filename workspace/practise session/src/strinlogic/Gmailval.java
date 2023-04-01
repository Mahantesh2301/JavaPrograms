package strinlogic;

import java.util.Scanner;

public class Gmailval {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   
	   if(str.contains("@")){
	   int dot1 = str.length()-3;
	   int dot2 = str.length()-4;
		   if(str.charAt(dot1) == '.'  || str.charAt(dot2) == '.'){
			   System.out.println("valid mail id ");
		   }else{
			   System.out.println("invalid mail id in");
		   }
	}else{
		   System.out.println("invalid mail id out");
	   }
	   
}
}
