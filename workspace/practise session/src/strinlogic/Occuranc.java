package strinlogic;

import java.util.Scanner;

public class Occuranc {
	 public static void occur(String str , char c){
		 String occured = "";
		 int count =1;
		 for (int i = 0; i <str.length(); i++) {
		char ch = str.charAt(i);		
		 if(occured.indexOf(ch) == -1){
			 if(ch == c){
				 count ++;
				 occured+=ch;
			 }
		 }
//		 return;
	 }
		 System.out.println(count);
	 }
  public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("enter a String");
     String str = sc.nextLine();
     System.out.println("enter a character to check occurance");
     char c = sc.next().charAt(0);
     occur(str , c);
     
}
}
