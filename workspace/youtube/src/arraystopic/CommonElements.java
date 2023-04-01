package arraystopic;

public class CommonElements {
	public static void main(String[] args) {
		//How to find common elements from two arrays in java?
				int[] a= {10,20,30,40,50};
				int[] b= {10,40,30};
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<b.length;j++)
					{
						if(a[i]==b[j])
						{
							System.out.println(a[i]);
						}
					}
				}
			}
}
