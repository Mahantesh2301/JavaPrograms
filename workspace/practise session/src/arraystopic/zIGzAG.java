package arraystopic;

import java.util.Arrays;

public class zIGzAG {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	int [] brr = {7,8,9,4};
	int [] crr = new int [arr.length+brr.length];
	int x = 0;
	int y = 0;
    
    if(arr.length<brr.length){
	for (int i = 0; i < crr.length; i++) {
		if(x < arr.length){
			if(i%2==0){
				crr[i]=arr[x];
				x++;
			}else{
				crr[i]=brr[y];
				y++;
			}
		}else{
			crr[i]=brr[y];
			y++;
		}
	}
    }else{
    	for (int i = 0; i < crr.length; i++) {
    		if(y < arr.length){
    			if(i%2==0){
    				crr[i]=arr[y];
    				y++;
    			}else{
    				crr[i]=brr[x];
    				x++;
    			}
    		}else{
    			crr[i]=brr[x];
    			x++;
    		}
    	}
    }
	System.out.println(Arrays.toString(crr));
}
}
