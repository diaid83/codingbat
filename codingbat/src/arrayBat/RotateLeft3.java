package arrayBat;

/*Given an array of ints length 3, return an array with the elements 
 *"rotated left" so {1, 2, 3} yields {2, 3, 1}.*/
public class RotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		int[] rotateLeft3 = {nums[1], nums[2], nums[0]};
		return rotateLeft3;
	}
	public static void main(String[] args) {
		
	}
}