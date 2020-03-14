package algorithm.junior;

/**
 * 移动零
 */
public class Alg_009 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12, 6, 8, 0, 9, 4, 0 };
		moveZeroesPlus(nums);
		for (int i = 0; i <= nums.length - 1; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	// 思路：统计出所有的0，然后循环遍历数组，把所有不为0的数依序重新放入数组
	public static void moveZeroes(int[] nums) {
		// 先统计出数组中所有0的个数
		int zeroCount = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == 0) {
				zeroCount++;
			}
		}
		if (zeroCount == 0) {
			return;
		}
		// 定义一个值作为指针保证移动之后的顺序，然后开始遍历移动数组
		int point = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] != 0) {
				nums[point] = nums[i];
				point++;
			}
		}
		// 移动完所有数值之后，循环将最后的几位数字置为0
		for (int i = nums.length - zeroCount; i <= nums.length - 1; i++) {
			nums[i] = 0;
		}
	}

	// 优化思路
	public static void moveZeroesPlus(int[] nums) {
		// 定义一个数值统计数组中所有0的个数
		int zeroCount = 0;
		// 遍历，如果出现非0元素，将该元素往前移动“前方的0的数量”格
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == 0) {
				zeroCount++;
			} else if (zeroCount > 0) {
				nums[i - zeroCount] = nums[i];
				nums[i] = 0;
			}
		}
	}

	// 再次优化
	public static void moveZeroesExtra(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int count = 0;
		for (int num : nums) {
			if (num != 0)
				nums[count++] = num;
		}
		while (count < nums.length)
			nums[count++] = 0;
	}
}
