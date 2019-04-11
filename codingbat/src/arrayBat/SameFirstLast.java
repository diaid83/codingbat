package arrayBat;
/*Given an array of ints, return true if the array is length 1 or more, 
 * and the first element and the last element are equal.*/
public class SameFirstLast {
	public boolean sameFirstLast(int[] nums) {
		return (nums.length>=1&&nums[0]==nums[nums.length-1]);

	}
	public static void main(String[] args) {
		int nums[] = {6,2,5,7,6};
		SameFirstLast g = new SameFirstLast();

		System.out.println(g.sameFirstLast(nums));
	}

}
