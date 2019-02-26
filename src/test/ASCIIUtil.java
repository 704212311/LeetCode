package test;

public class ASCIIUtil {

	public static String convertStringToAsc(String str) {

		char[] chars = str.toCharArray();

		StringBuffer hex = new StringBuffer();
		for (int i = 0; i < chars.length; i++) {
			hex.append(Integer.toHexString((int) chars[i]));
		}

		return hex.toString();
	}

	public static String convertAscToString(String hex) {

		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();

		// 49204c6f7665204a617661 split into two characters 49, 20, 4c...
		for (int i = 0; i < hex.length() - 1; i += 2) {

			// grab the hex in pairs
			String output = hex.substring(i, (i + 2));
			// convert hex to decimal
			int decimal = Integer.parseInt(output, 16);
			// convert the decimal to character
			sb.append((char) decimal);

			temp.append(decimal);
		}

		return sb.toString();
	}

	/**
	 * 十六进制转十进制
	 */
	public static Integer getDecNum(String num) {
		return Integer.parseInt(num.substring(0), 16);
	}

	/**
	 * 十进制转十六进制（长度1WORD）
	 */
	public static String get1WordHexStr(Integer num) {
		String numStr = Integer.toHexString(num);
		int strLen = numStr.length();
		int totalLength = 4;
		if (strLen < totalLength) {
			while (strLen < totalLength) {
				StringBuffer sb = new StringBuffer();
				sb.append("0").append(numStr);// 左补0
				numStr = sb.toString();
				strLen = numStr.length();
			}
		}
		return numStr;
	}

}
