package test;

import java.util.ArrayList;
import java.util.List;

public class MatchTest {

	public static void main(String[] args) {
		// 所有队伍
		String[] teams = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
		// 创建集合接收
		List<String[]> result = new ArrayList<String[]>();
		// {"AB", "CD", "EF", "GH", "IJ", "KL"}
		for (int i = 0; i < teams.length / 2; i++) {
			String[] matches = new String[6];
			for (int j = 0; j < teams.length / 2; j++) {
				// 对战的两支队伍
				String m = teams[j];
				String n = teams[(j + i + teams.length / 2) > teams.length - 1 ? (j + i) : (j + i + teams.length / 2)];
				matches[j] = m + n;
			}
			result.add(matches);
		}
		System.out.println("result.size() = " + result.size());
		for (String[] strArr : result) {
			for (int i = 0; i < strArr.length; i++) {
				System.out.print(strArr[i] + " ");
			}
			System.out.println();
		}
	}

	// 返回集合中每个字符串数组包含6个元素
	// 例：{"AB", "CD", "EF", "GH", "IJ", "KL"}
	@SuppressWarnings("unused")
	public static List<String[]> func() {
		// 所有队伍
		String[] teams = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
		// 结果集，最终大小为11
		List<String[]> result = new ArrayList<String[]>();

		// TODO
		// PS:禁用枚举法_(:з」∠)_

		return result;
	}
}
