package algorithm.junior;

/**
 * 旋转数组
 */
public class Alg_003 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
	}

	public static void rotate(int[] nums, int k) {
		int length = nums.length;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[(i + k) % length] = nums[i];
		}
		for (int i = 0; i < arr.length; i++) {
			nums[i] = arr[i];
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	// 超时方法↓

	// 需要旋转多次，数组长度越长复杂度越高
	public static void rotate_001(int[] nums, int k) {
		// 相当于向右旋转k次，每次旋转一位
		for (int i = 0; i < k; i++) {
			nums = once(nums);
		}
	}

	// 定义一个方法旋转一次
	public static int[] once(int[] nums) {
		if (nums == null || nums.length == 0) {
			return nums;
		}
		int temp = nums[nums.length - 1];
		for (int i = nums.length - 1; i > 0; i--) {
			nums[i] = nums[i - 1];
		}
		nums[0] = temp;
		return nums;
	}
}
