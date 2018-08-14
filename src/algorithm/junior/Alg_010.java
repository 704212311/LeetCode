package algorithm.junior;

/**
 * 反转字符串
 */
public class Alg_010 {

	public static void main(String[] args) {
		String abc = "abc";
		String cba = reverseString(abc);
		System.out.println(abc);
		System.out.println(cba);
	}

	public static String reverseString(String s) {
		if (s.equals("")) {
			return s;
		}
		char[] strs = s.toCharArray();
		for (int i = 0; i < strs.length / 2; i++) {
			char temp = strs[i];
			strs[i] = strs[strs.length - 1 - i];
			strs[strs.length - 1 - i] = temp;
		}
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i]);
		}
		return sb.toString();
	}
}
