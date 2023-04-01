package arraystopic;

import java.util.Arrays;

public class Leetremove {
	public int removeElement(int[] nums, int val) {       
        int k = 0;
	for(int i =0; i<nums.length; i++){      
            if(nums[i]==val){
            	nums[i]=-1;
               k++;                
            }
    }
    int[]exp=new int[k];
     int[]exp1=new int[nums.length-k];
    int x =0;
    int y =0;
    for(int i =0; i<nums.length;i++){
         if(nums[i]==-1){
             exp[x]=nums[i];
             x++;
         }else{
             exp1[y]=nums[i];
             y++;
         }
    }
    int a = 0;
    int b = 0;
       for (int i = 0; i < nums.length; i++) {
			if(a<exp1.length){
				nums[i]=exp1[a];
                a++;
			}
			else if(b<exp.length){
				nums[i]=exp[b];
				b++;
			}
      		}
System.out.println(Arrays.toString(nums));

     return k;
    }
   public static void main(String[] args){ 
	   Leetremove   s = new Leetremove();
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(s.removeElement(nums,val));
    }
}
