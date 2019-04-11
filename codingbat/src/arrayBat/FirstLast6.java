package arrayBat;
/*	Given an array of ints, return true if 6 appears as either the first
 *  or last element in the array. The array will be length 1 or more.*/
public class FirstLast6 {

	public boolean firstLast6(int[] nums) {
		/*if (nums[0]==6||nums[nums.length-1]==6) {
			return true;
		}else return false;*/
		return(nums[0] == 6 || nums[nums.length - 1] == 6);
	}
	public static void main(String[] args) {
		int nums[] = {3,2,5,7,6};
		FirstLast6 g = new FirstLast6();
		System.out.println(g.firstLast6(nums));
	}

}
