package algorithm.junior;

import java.util.Arrays;

/**
 * 有效的字母异位词
 */
public class Alg_017 {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		String o = "cat";
		String p = "rat";

		System.out.println(isAnagram(s, t));
		System.out.println(isAnagram(o, p));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] count_s = getIntArr(s);
		int[] count_t = getIntArr(t);
		return Arrays.equals(count_s, count_t);
	}

	// 定义一个方法，用长度26的数组记录每个字母出现的次数
	public static int[] getIntArr(String str) {
		int[] result = new int[26];
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			result[(int) c - 97]++;
		}
		return result;
	}
}
