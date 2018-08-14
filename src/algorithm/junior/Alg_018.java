package algorithm.junior;

/**
 * 验证回文字符串
 */
public class Alg_018 {

	public static void main(String[] args) {
		// String a = "A";
		// String b = "a";
		// System.out.println(a.equalsIgnoreCase(b));
		// System.out.println(a.equals(b));
		// char chr_a = 'A';
		// char chr_b = 'a';
		// System.out.println((chr_a + "").equalsIgnoreCase(chr_b + ""));
		// System.out.println((chr_a + "").equals(chr_b + ""));
		// String regex = "[a-zA-Z]";
		// System.out.println(a.matches(regex));
		// System.out.println(b.matches(regex));

		// String str_1 = "A man, a plan, a canal: Panama";
		// String str_2 = "race a car";
		// System.out.println(isPalindrome(str_1));
		// System.out.println(isPalindrome(str_2));

		System.out.println(isPalindrome("0P"));
	}

	public static boolean isPalindrome(String s) {
		if (s.length() == 0) {
			return true;
		}
		char[] charArr = s.toCharArray();
		// 定义两个下标，分别从前后两端遍历字符数组
		int i = 0, j = 0;
		String regex = "[a-zA-Z0-9]";
		while (i + j < charArr.length) {
			// 如果一端不为字母/数字，则改变下标
			if (!(charArr[i] + "").matches(regex)) {
				i++;
				continue;
			} else if (!(charArr[charArr.length - 1 - j] + "").matches(regex)) {
				j++;
				continue;
			}
			// 执行至此，两端都为字母/数字，对比是否相等
			if ((charArr[i] + "").equalsIgnoreCase(charArr[charArr.length - 1 - j] + "")) {
				// 相等，则向中间逼近
				i++;
				j++;
				continue;
			} else {
				// 不等，直接返回false
				return false;
			}
		}
		return true;
	}
}
