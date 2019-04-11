package arrayBat;
/*Given an array of ints of even length, return a new array length 2 
  containing the middle two elements from the original array. The original 
  array will be length 2 or more.*/
public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		int[] arr = new int[2];
		arr[0]= nums[nums.length/2-1];
		arr[1]= nums[nums.length/2];	  
		return arr;
	}
}
