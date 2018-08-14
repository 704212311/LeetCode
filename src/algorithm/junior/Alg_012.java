package algorithm.junior;

/**
 * 字符串中的第一个唯一字符
 */
public class Alg_012 {

	public static void main(String[] args) {
		String abc = "dddccdbba";
		System.out.println(firstUniqChar(abc));
	}

	public static int firstUniqChar(String s) {
		char[] charArray = s.toCharArray();
		if (charArray.length == 1) {
			return 0;
		}
		// 简单的嵌套循环遍历判断所有字符
		o: for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				if (i != j && charArray[i] == charArray[j]) {
					continue o;
				}
				// 如果循环到最后一位仍然没有相同字符则为唯一字符
				if (j == charArray.length - 1) {
					return i;
				}
			}
		}
		return -1;
	}

	// 超时方法↓

	public static int firstUniqChar_01(String s) {
		String new_s = s;
		char[] charArray = s.toCharArray();
		if (charArray.length == 1) {
			return 0;
		}
		o: for (int i = 1; i < charArray.length; i++) {
			for (int j = 0; j < i; j++) {
				// 缺省值置为0
				if (charArray[i] == charArray[j]) {
					// 如果有重复字符，则将所有该字符都置为0
					new_s = new_s.replace(charArray[i], '0');
					continue o;
				}
			}
		}
		char[] new_charArray = new_s.toCharArray();
		// 最终不为0的字符即落单，直接返回
		for (int i = 0; i < new_charArray.length; i++) {
			if (new_charArray[i] != '0') {
				return i;
			}
		}
		return -1;
	}
}
