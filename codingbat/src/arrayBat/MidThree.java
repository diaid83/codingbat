package arrayBat;
/*Given an array of ints of odd length, return a new array length 3 containing
  the elements from the middle of the array. The array length will be at 
  least 3.*/
public class MidThree {
	public int[] midThree(int[] nums) {
		int[] mid = {nums[nums.length/2-1],
				nums[nums.length/2], nums[nums.length/2+1]};
		return mid;
	}
}
