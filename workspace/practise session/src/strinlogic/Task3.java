package strinlogic;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	//one
//	System.out.println("enter a string");
//	String str = sc.nextLine();
//	System.out.println(str.toUpperCase());
//	System.out.println("*****************************");
//	String str1 = sc.nextLine();
//    char [] strc = str1.toCharArray();
//    String res = "";
//    for(int i = strc.length-1; i>=0;i--){
//    	res = res+strc[i];
//    }
//    System.out.println(res);
//    System.out.println("*******************************");
//    String [] strarr = {"red","orange","yellow","green","blue","indigo","violet"};
//    for (int i = 0; i < strarr.length; i++) {
//    	System.out.println(strarr[i].charAt(0));
//	}
//    System.out.println("**********************************");
//    String str2 = sc.nextLine();
//    System.out.println(str2.substring(2, 6));
//    System.out.println("************************************");
//    String str3 = sc.nextLine();
//    System.out.println(str3.replace(" ", ""));
//    System.out.println("************************************");
//    String str4 = sc.nextLine();
//    String str5 = sc.nextLine();
//    System.out.println(str4.concat(str5));
//    System.out.println("*************************************");
//    String str6 = sc.nextLine();
//    System.out.println(str6.length());
//    System.out.println("*************************************");
//    String str7 = sc.nextLine();
//    String[] strbrr= str7.split(" ");
//    System.out.println(Arrays.toString(strbrr));
//      System.out.println("***************************************");
//      String str8 = "Test Yantra";
//      String  strn[] = str8.split(" ");
//      System.out.println(Arrays.toString(strn)); 
//      System.out.println("***************************************");
//      String city = "banglore,mysore,manglore";
//      String [] strs = city.split(",");
//      System.out.println(Arrays.toString(strs));
//      System.out.println("***************************************");
//      String str9 = "hello all";
//      char [] con = str9.toCharArray();
//      System.out.println(Arrays.toString(con));
//      String cons = new String(con);
//      System.out.println(cons);
//      System.out.println("***************************************");
//      String str10 = sc.nextLine();
//      System.out.println("enter old character");
//      char old = sc.next().charAt(0);
//      System.out.println("enter new character");
//      char newc = sc.next().charAt(0);
//      System.out.println(str10.replace(old, newc));
//      System.out.println("***************************************");
//      String s1 = "kite";
//      String s2 = " is flying";
//      System.out.println(s1.concat(s2));
//      System.out.println("***************************************");
//      System.out.println("enter a string to reverse");
//      String s3 = sc.nextLine();
//      String []stra = s3.split(" ");
//      String rev = "";
//      for (int i = 0; i < stra.length; i++) {
//		rev = rev+back(stra[i]+" ");
//	  }
//      System.out.println(rev);
      System.out.println("***************************************");
      String str11 = sc.nextLine();
      System.out.println(str11.startsWith("H"));
       
}
 static String back(String str) {
  String	rev = "";
	char [] ch = str.toCharArray();
	for (int i = ch.length-1; i >= 0; i--) {
		rev = rev+ch[i];
	}
	return rev;
}
}
