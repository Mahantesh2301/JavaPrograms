package strinlogic;

import java.util.Scanner;

public class Print4Num {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	
//	  System.out.println(str.substring(0,4).concat("******"));
	  
//	  System.out.println(str.charAt(0)+" "+str.charAt(str.length()-1));
	  
//	  	  
//	 for (int i = 0; i < str.length(); i++) {
//		char ch  = str.charAt(i);
//		if(i%2==0){
//		  	int no = ch-32;
//		  	ch = (char) no;
//		  	news = news+ch;
//		}else{
//			news = news+ch;
//		}
//	}
//	 System.out.println(news);
	  
	  
//	  int con = 0;
//	  int vow = 0;
//	  for (int i = 0; i < str.length(); i++) {
//		char ch = str.charAt(i);
//		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
//			vow++;
//		}else{
//			con++;
//		}
//	}
//	  System.out.println("count of consonants is == "+con);
//	  System.out.println("count of vowels is == "+vow);
	  
	  System.out.println("enter a String");
	  String str = sc.nextLine().toLowerCase();
	  
	  String newS = "";
	  
	  for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(i>=str.length()/2){
			int no = (int)ch-32;
			ch = (char)no;
			newS+=ch;
		}else{
			newS+=ch;
		}
	}
	  System.out.println(newS);
}
}
