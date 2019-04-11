package arrayBat;
/*Given an int array length 3, if there is a 2 in the array immediately 
  followed by a 3, set the 3 element to 0. Return the changed array.*/
public class Fix23 {
	public int[] fix23(int[] nums) {
		int[] fix = {nums[0], nums[1], nums[2]};
		if (nums[0]==2&&nums[1]==3) {
			fix[1]=0; 
		}else if(nums[1]==2&&nums[2]==3) {
			fix[2]=0;
		}
		return fix;
	}
}
