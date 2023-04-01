package strinlogic;

public class CountWords {
  public static void main(String[] args) {
	String str = "hello world hello world ";
	int count =1;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)>=33 && str.charAt(i+1)<=136)
			count++;
	}
	
	System.out.println(count +" words");
	
//	String [] str1 = str.split(" ");
//	System.out.println(str1.length +" words");
	
}
}
