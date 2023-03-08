package dynamic_input;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         String rev = "";
         
         for (int i =str.length()-1 ; i>=0;i-- )
         {
        	 rev = rev+str.charAt(i);                         //ctr+shift+f allignment
        	                                                     //ctr+f11 run
        	                                                    //ctr+fn+f11 run
         }
         System.out.println(rev);
         
         if (rev.equals(str));
         {
        	 System.out.println("its palindrome");
         }
        	 
         sc.close();
        
	}

}
