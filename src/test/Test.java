package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// 所有队伍
		String[] teams = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
		// 创建集合接收
		List<String[]> result = new ArrayList<String[]>();
		// {"AB", "CD", "EF", "GH", "IJ", "KL"}
		for (int i = 0; i < teams.length - 1; i++) {
			String[] matches = new String[6];
			// 次数为teams.length/2，手动匹配
			if (i % 2 != 0) {
				// 奇数策略
				matches[0] = teams[0] + teams[11];
				matches[1] = teams[1] + teams[10];
				matches[2] = teams[2] + teams[9];
				matches[3] = teams[3] + teams[8];
				matches[4] = teams[4] + teams[7];
				matches[5] = teams[5] + teams[6];
				// 位移数组
				teams = change(teams);
			} else {
				// 偶数策略
				matches[0] = teams[0] + teams[10];
				matches[1] = teams[1] + teams[9];
				matches[2] = teams[2] + teams[8];
				matches[3] = teams[3] + teams[7];
				matches[4] = teams[4] + teams[6];
				matches[5] = teams[5] + teams[11];
			}
			result.add(matches);
		}
		for (String[] matches : result) {
			for (String match : matches) {
				System.out.print(match + " ");
			}
			System.out.println();
		}
	}

	public static String[] change(String[] teams) {
		for (int i = 0; i < teams.length; i++) {
			if (i != teams.length - 1) {
				String temp = teams[i];
				teams[i] = teams[i + 1];
				teams[i + 1] = temp;
			}
		}
		return teams;
	}
}
