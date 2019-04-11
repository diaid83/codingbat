package arrayBat;
//Given an array of ints length 3, return the sum of all the elements.
public class Sum3 {
	public int sum3(int[] nums) {
		return nums[0]+nums[1]+nums[2];
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		Sum3 g = new Sum3();
		System.out.println(g.sum3(nums));

	}

}
