package arrayy;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
			
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					int temp = nums[j];
					nums[j] = nums[nums.length - 1 - i];
					nums[nums.length - 1 - i] = temp;					
				}
			}
		}
		System.out.println(Arrays.toString(nums));
//		System.out.println(count);
	}
}
