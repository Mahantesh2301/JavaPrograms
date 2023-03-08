package arrayy;

public class Strongarray {

	public static void main(String[] args) {

		int[] arr = { 124, 145, 125, 456 };
		int[] copy=arr;
		for (int i = 0; i < arr.length; i++) {
             int c = arr[i];
			int sum = 0;
			while (c != 0) {
				int rem = c % 10;
				int mul = 1;
				for (int a = rem; a >= 1; a--) {
					mul = mul * a;
				}
				sum = mul + sum;
                c=c/10;
                for(int z=0;z<copy.length;z++)
    			{
    				if(copy[z]==sum)
    				{
    					System.out.println( sum +" strong");
    				}
    			}
                
			}
			

			//{123,145,125,564}

		}
	}

}
