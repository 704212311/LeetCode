package algorithm.junior;

/**
 * 从排序数组中删除重复项
 */
public class Alg_001 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 3, 3, 5, 5, 5, 6, 6, 6, 7, 7 };
		int removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);
	}

	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int m = nums[0]; // m记录当前数，从第0位开始
		int count = 0; // count记录当前数m一共重复的次数
		int num = 0; // num记录新数组目前的位数
		for (int i = 0; i < nums.length; i++) {
			if (m == nums[i] && count == 0) {
				// 循环开始
				// 新数组记录当前数，num自增，然后count自增
				nums[num] = m;
				num++;
				count++;
				continue;
			} else if (m == nums[i] && count != 0) {
				// 非第一次循环到当前数
				// 新数组不做记录，count自增
				count++;
				continue;
			} else if (m != nums[i]) {
				// 第一次循环到当前数
				// 先给m赋值，新数组记录当前数，num自增，然后count归一
				m = nums[i];
				nums[num] = m;
				num++;
				count = 1;
				continue;
			}
		}
		return num;
	}
}
