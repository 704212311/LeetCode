package algorithm.junior;

/**
 * 两个字符串的最大公共子字符串
 */
public class Alg_020 {

	public static void main(String[] args) {
		String strx = "abcde";
		String stry = "bcd";
		String str = longestCommonSubsequence(strx, stry);
		System.out.println("最大公共子字符串 ->" + str);
	}

	public static String longestCommonSubsequence(String strx, String stry) {
		// 判空
		if (strx.isEmpty() || stry.isEmpty()) {
			return "";
		}
		// 判断是否有包含关系
		if (strx.contains(stry)) {
			return stry;
		} else if (stry.contains(strx)) {
			return strx;
		}
		// 把字符串分出长短，以短字符串为基础
		String longStr = strx.length() > stry.length() ? strx : stry;
		String shortStr = strx.length() > stry.length() ? stry : strx;
		// 从短字符串的第1位开始，取值去和长字符串作contains对比，得出最长取值并保存
		String result = "";
		for (int i = 0; i <= shortStr.length() - 1; i++) {
			String longestSubsequence = longestSubsequence(longStr, shortStr, i);
			result = longestSubsequence.length() > result.length() ? longestSubsequence : result;
		}
		return result;
	}

	// 定义一个方法，接受两个字符串和一个下标int值，得出短字符串从下标开始起被长字符串包含的最长值
	public static String longestSubsequence(String longStr, String shortStr, int start) {
		StringBuffer sb = new StringBuffer("");
		for (int i = start; i <= shortStr.length() - 1; i++) {
			if (longStr.contains(shortStr.substring(start, i + 1))) {
				// 如果包含，将当前值放入StringBuffer
				sb.append(shortStr.charAt(i));
			} else {
				// 如果不包含，打破循环
				break;
			}
		}
		return sb.toString();
	}
}


