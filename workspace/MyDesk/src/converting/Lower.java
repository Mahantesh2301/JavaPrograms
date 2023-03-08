package converting;

public class Lower {
   public static void main(String[] args) {
	String str = "mahan";
	for(int i =0; i<str.length();i++)
	{
		char ch=str.charAt(i);
		 ch =(char)(ch-32);
		System.out.print(ch);
//		int no =(int)str.charAt(i)-32;
//		char ch = (char)no;
//		System.out.print(ch);
	}
}
}
