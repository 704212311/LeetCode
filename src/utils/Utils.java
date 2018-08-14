package utils;

/**
 * 杂七杂八的工具类
 */
public class Utils {

	public static void main(String[] args) {

	}

	// 冒泡
	public static void bubbleSort(int[] nums) {
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

	// 判断是否为质数
	public static boolean isPrime(int x) {
		if (x <= 1) {
			return false;
		}
		if ((x != 2 && x % 2 == 0) || (x != 3 && x % 3 == 0) || (x != 5 && x % 5 == 0)) {
			return false;
		}
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 将数组后移一位
	public static int[] backward(int[] teams) {
		for (int i = 0; i < teams.length; i++) {
			if (i != teams.length - 1) {
				int temp = teams[i];
				teams[i] = teams[i + 1];
				teams[i + 1] = temp;
			}
		}
		return teams;
	}

	// 将数组从下标n开始往后推移一位
	public static int[] backward(int[] nums, int n) {
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
