package algorithm.junior;

/**
 * 只出现一次的数字
 */
public class Alg_006 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 1, 2, 4 };
		System.out.println(singleNumber_2(nums));
	}

	public static int singleNumber(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		// 定义一个数来记录已遍历过的数
		int count = 1;
		// 定义一个数来记录已遍历过且重复的数
		int s_count = 0;
		o: for (int i = 1; i < nums.length; i++) {
			// 内层遍历下标范围为0-count（不包含count）
			for (int j = 0; j < count; j++) {
				if (nums[i] == nums[j]) {
					// 如果查询到重复，则将重复了的nums[j]放在首个未重复的位置，即将nums[j]和nums[s_count]交换
					swap(nums, j, s_count);
					// s_count自增
					s_count++;
					continue o;
				}
				if (nums[i] != nums[j] && j == count - 1) {
					// 最后一次循环仍不重复，则将nums[i]放到下标j之后，即将nums[i]和nums[count]交换
					swap(nums, i, count);
					// count自增
					count++;
					continue o;
				}
			}
		}
		// 最后循环完毕之后，唯一不重复的数处于数组中间
		return nums[(nums.length / 2)];
	}

	public static void swap(int[] nums, int m, int n) {
		if (m < 0 || n < 0 || m > nums.length - 1 || n > nums.length - 1) {
			// 下表越界不做处理
		} else {
			int temp = nums[m];
			nums[m] = nums[n];
			nums[n] = temp;
		}
	}

	public static int singleNumber_2(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		o: for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				// 缺省值置为0
				if (nums[i] == nums[j]) {
					// 如果有重复数，则将两数都置为0
					nums[i] = 0;
					nums[j] = 0;
					continue o;
				}
			}
		}
		// 最终不为0的数即为落单数，除非落单数也为0
		for (int i : nums) {
			if (i != 0) {
				return i;
			}
		}
		return 0;
	}
}
