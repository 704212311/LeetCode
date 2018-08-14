package algorithm.junior;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复
 */
public class Alg_004 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		System.out.println(containsDuplicate(nums));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean containsDuplicate(int[] nums) {
		Set s = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			// 利用set添加重复元素时会失败并返回false的特性
			boolean add = s.add(nums[i]);
			if (!add) {
				return true;
			}
		}
		return false;
	}
}
