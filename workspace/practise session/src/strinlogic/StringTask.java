package strinlogic;
import java.util.Arrays;
import java.util.Scanner;
public class StringTask {
public static void main(String[] args) {
	String str1 = "\"  TEST YANTRA  \""; 
	System.out.println("converted lower--> "+str1.toLowerCase());
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String");
	String stru = sc.nextLine();
	System.out.println("length of given String-->"+stru.length());
	System.out.println("converted lower--> "+stru.toLowerCase());
	System.out.println("converted upper--> "+stru.toUpperCase());
	System.out.println("index of given cahracter-->"+stru.indexOf('a'));
	System.out.println("fetch cahracter upon index values-->"+stru.charAt(3));
	System.out.println("concating two strings-->"+stru.concat(str1));
	System.out.println("starts with-->"+str1.startsWith("Test"));
	System.out.println("ends with-->"+str1.endsWith("yantra"));
	System.out.println("substring -->"+stru.substring(2));
	System.out.println("particular substring-->"+stru.substring(2,6));
	System.out.println(stru.toCharArray());
	String str3 [] = stru.split("");
	System.out.println(Arrays.toString(str3));
	String[] str2 = stru.split(" ", 2);
	System.out.println("array-->"+Arrays.toString(str2));
	System.out.println(stru.replace('M', 'A'));
	System.out.println(stru.replaceAll(" ", ""));
	System.out.println(stru.replaceFirst("a", "b"));
	System.out.println(stru.replaceAll(" " , "0"));
	System.out.println(str1.matches("T"));
	System.out.println(stru.compareTo(str1));
	System.out.println(str1.lastIndexOf(3));
	System.out.println("removing space start and end-->"+str1.trim());
	System.out.println("equals method-->"+str1.equals(stru));
	System.out.println(stru.isEmpty());
}
}
