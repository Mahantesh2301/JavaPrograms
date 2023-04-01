package arraystopic;

import java.util.Arrays;

public class CommonEleIn3Arr {
 public static void main(String[] args) {
	int arr[]={1,2,5,3,4,5};
	int brr[]={5,2,8,3,4,5};
	int crr[]={6,2,5,9,4,5};
	Arrays.sort(arr);
	Arrays.sort(brr);
	Arrays.sort(crr);
	int x=0;
	int y=0;
	int z=0;
	while(x<arr.length && y<brr.length && z<crr.length){
		if(arr[x]==brr[y] && brr[y]==crr[z]){
			System.out.println(arr[x]);
			x++;
			y++;
			z++;
		}else if(arr[x]>brr[y]){
			y++;
		}else if(brr[y]>crr[z]){
			z++;
		}else{
			x++;
		}
	}
	
}
}
