package arraystopic;

public class FindInd {
	public static void main(String[] args) {
		//How to find index of element in array in java?
		String[] s= {"Red","Blue","Yellow","Orrange"};
		int ind=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=="Orrange")
			{
				ind=i;
			}
		}
		System.out.println("Index= "+ind);
	}
}
