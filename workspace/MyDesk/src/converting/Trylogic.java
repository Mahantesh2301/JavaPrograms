package converting;

public class Trylogic {
    public static void main(String[] args) {
		String str = "hello java how are you";
//		String[] str1= str.split(" ");
//		for(int i =0 ; i<str1.length; i++)
//		{
//			char[] ch = str1[i].toCharArray();
//			ch[0]=(char) (ch[0]-32);
//			System.out.print(ch);
//		}
		
		char[] ch = str.toCharArray();
		ch[0]=(char)(ch[0]-32);
		for(int i =1 ; i< ch.length; i++)
		{
			if(ch[i]==' ')
			{
				ch[i+1] = (char)(ch[i+1]-32);
			}
		}
		System.out.println(ch);
		
	}
}
