package algorithm.junior;

/**
 * 合并两个有序数组
 */
public class Alg_016 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 4, 5, 7, 8, 0, 0, 0 };
		int[] nums2 = { 3, 6, 9 };
		int m = 6;
		int n = 3;
		nums1 = merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.print(i + " ");
		}
	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		// 合并两个数组然后冒泡
		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}
		sort(nums1);
		return nums1;
	}

	// 冒泡
	public static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
	}
}
