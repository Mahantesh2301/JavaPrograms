package arraystopic;

import java.util.Arrays;

public class Segregat0N1 {
 public static void main(String[] args) {
	 int [] arr = {0,1,0,1,0,1,0};
	 int x = 0;
	 for (int i = 0; i < arr.length; i++) {
		if(arr[i]==0){
			int temp = arr[x];
			arr[x]=arr[i];
			arr[i]=temp;
			x++;
		}
	}
	 System.out.println(Arrays.toString(arr));
}
}
