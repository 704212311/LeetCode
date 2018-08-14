package algorithm.junior;

/**
 * 两个数组的交集 II
 */
public class Alg_007 {

	public static void main(String[] args) {
		int[] nums1 = { 3, 8, 7, 4, 5, 6, 2, 1 };
		int[] nums2 = { 1, 2, 6, 9 };
		// int[] nums1 = { 1, 1 };
		// int[] nums2 = { 1, 2 };
		int[] intersect = intersect(nums1, nums2);
		for (int i : intersect) {
			System.out.println(i);
		}
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		if (nums1.length == 0 || nums2.length == 0) {
			return new int[] {};
		}
		// 结果集以小数组大小为准
		int[] tempArr;
		int count = 0;
		tempArr = nums1.length < nums2.length ? new int[nums1.length] : new int[nums2.length];
		// 对两数组进行排序
		sort(nums1);
		sort(nums2);
		// 定义两个指针
		int in1 = 0;
		int in2 = 0;
		while (true) {
			if (in1 > nums1.length - 1 || in2 > nums2.length - 1) {
				break;
			}
			// 依次比较排序后的两数组
			if (nums1[in1] == nums2[in2]) {
				tempArr[count] = nums1[in1];
				count++;
				in1++;
				in2++;
			} else if (nums1[in1] > nums2[in2]) {
				// 小的一方下标自增
				in2++;
			} else {
				in1++;
			}
		}
		// 最后创建一个大小适当的数组作为结果
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = tempArr[i];
		}
		return result;
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
