package converting;

public class Upperlower {
      public static void main(String[] args) {
		char ch = 'j';
		int no = (int)ch-32;
		ch = (char)no;
		System.out.println(ch);
		
		char ch1 = 'a';
		ch1 = (char)(ch1-32);
		System.out.println(ch1);
		}
}
