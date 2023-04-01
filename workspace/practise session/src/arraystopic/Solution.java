package arraystopic;

import java.util.Arrays;

public class Solution {
	int count = 0;
    public int removeDuplicates(int[] nums) {        
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j< nums.length;j++){
                if(nums[i]==nums[j]&&nums[i]!=-1){
                    nums[j]=-1;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
        int res1 [] = new int[count];
        int res[]=new int[nums.length-count];
        int x =0;
        int y = 0;
        for(int i = 0; i<nums.length;i++){
            
             if(nums[i]!= -1){
                 res[x]=nums[i];
                 x++;
             }     
             if(nums[i]==-1){
            	 res1[y] =nums[i]; 
            	 y++;
             }
        }
        for (int i = 0; i < nums.length; i++) {
			if(x<res.length){
				nums[i]=res[x];
				x++;
			}
			else if(y<res1.length){
				nums[i]=res1[y];
				y++;
			}
      		}
       
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res1));
        int k = res.length;
        return k;
    }
    public static void main (String[] args){
        int [] nums = {0,1,1,1,2,2};
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(nums));
    }
}

