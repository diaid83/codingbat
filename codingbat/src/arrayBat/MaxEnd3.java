package arrayBat;
/*Given an array of ints length 3, figure out which is larger, the first or 
 last element in the array, and set all the other elements to be that value.
  Return the changed array.*/
public class MaxEnd3 {
	public int[] maxEnd3(int[] nums) {
		int[] maxEnd3 = {nums[0],nums[1],nums[2]};
		if(maxEnd3[0] > maxEnd3[2]){
			maxEnd3[1] = maxEnd3[0];
			maxEnd3[2] = maxEnd3[0];
		}else 
			maxEnd3[0] = maxEnd3[2];
			maxEnd3[1] = maxEnd3[2];
		return maxEnd3;
	}
}
/*public int[] maxEnd3(int[] nums) {
	  int max = Math.max(nums[0], nums[2]);
	  nums[0] = max;
	  nums[1] = max;
	  nums[2] = max;
	  return nums;*/
	  
