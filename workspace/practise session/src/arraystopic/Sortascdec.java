package arraystopic;

import java.util.Arrays;

public class Sortascdec {
     public static void main(String[] args) {
		
    	 int [] arr = {3,2,5,8,1};
    	  	 
    	 for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
				int	temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
    	 System.out.print(Arrays.toString(arr));
	}
}