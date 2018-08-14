package algorithm.junior;

/**
 * 颠倒整数
 */
public class Alg_011 {

	public static void main(String[] args) {
		int x = 1534236469;
		System.out.println(reverse(x));
	}

	public static int reverse(int x) {
		if (x == 0) {
			return x;
		}
		boolean negative = x < 0;
		String str = new Integer(x).toString();
		char[] strs = str.toCharArray();
		for (int i = 0; i < strs.length / 2; i++) {
			char temp = strs[i];
			strs[i] = strs[strs.length - 1 - i];
			strs[strs.length - 1 - i] = temp;
		}
		StringBuffer sb = new StringBuffer("");
		int zeroCount = -1;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == '0') {
				zeroCount++;
			}
			if ((strs[i] != '0' || zeroCount != i) && !(negative && i == strs.length - 1)) {
				sb.append(strs[i]);
			}
		}
		if (negative) {
			sb.insert(0, "-");
		}
		try {
			return Integer.valueOf(sb.toString());
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
