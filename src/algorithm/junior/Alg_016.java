package algorithm.junior;

/**
 * 合并两个有序数组
 */
public class Alg_016 {

	public static void main(String[] args) {
		int[] nums = { 1, 0 };
		int[] nums1 = { 1, 2, 4, 5, 7, 8, 0, 0, 0 };
		int[] nums2 = { 3, 6, 9 };
		nums1 = process(nums, 0);
		for (int i : nums1) {
			System.out.print(i + " ");
		}
		int m = nums1.length;
		int n = nums2.length;
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1.length < m + n) {
			return;
		}
	}

	// 定义一个方法，将nums数组从下表n开始往后推移一位
	public static int[] process(int[] nums, int n) {
		if (n > nums.length - 2) {
			return nums;
		}
		for (int i = nums.length - 1; i >= n; i--) {
			if (i != n) {
				int temp = nums[i];
				nums[i] = nums[i - 1];
				nums[i - 1] = temp;
			}
		}
		return nums;
	}
}
