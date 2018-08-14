package algorithm.junior;

import java.util.HashSet;
import java.util.Set;

/**
 * 有效的数独
 */
public class Alg_005 {

	public static void main(String[] args) {
		char[] line1 = { '5', '3', '.', '.', '7', '.', '.', '.', '.' };
		char[] line2 = { '6', '.', '.', '1', '9', '5', '.', '.', '.' };
		char[] line3 = { '.', '9', '8', '.', '.', '.', '.', '6', '.' };
		char[] line4 = { '8', '.', '.', '.', '6', '.', '.', '.', '3' };
		char[] line5 = { '4', '.', '.', '8', '.', '3', '.', '.', '1' };
		char[] line6 = { '7', '.', '.', '.', '2', '.', '.', '.', '6' };
		char[] line7 = { '.', '6', '.', '.', '.', '.', '2', '8', '.' };
		char[] line8 = { '.', '.', '.', '4', '1', '9', '.', '.', '5' };
		char[] line9 = { '.', '.', '.', '.', '8', '.', '.', '7', '9' };
		char[][] board = new char[9][];
		board[0] = line1;
		board[1] = line2;
		board[2] = line3;
		board[3] = line4;
		board[4] = line5;
		board[5] = line6;
		board[6] = line7;
		board[7] = line8;
		board[8] = line9;

		System.out.println(lineIsValid(board));
		System.out.println(columnIsValid(board));
		System.out.println(zoneIsValidWithOneSet(board));

		System.out.println(isValidSudoku(board));

	}

	public static boolean isValidSudoku(char[][] board) {
		return lineIsValid(board) && columnIsValid(board) && zoneIsValid(board);
	}

	// 定义一个方法判断行上是否有重复
	@SuppressWarnings("all")
	public static boolean lineIsValid(char[][] board) {
		Set set = new HashSet();
		for (char[] chars : board) {
			for (char c : chars) {
				if ('.' != c) {
					if (!set.add(c)) {
						return false;
					}
				}
			}
			// 每次循环单行之后清空
			set.removeAll(set);
		}
		return true;
	}

	// 定义一个方法判断列上是否有重复
	@SuppressWarnings("all")
	public static boolean columnIsValid(char[][] board) {
		Set set = new HashSet();
		// 内外层都循环固定9次
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				if ('.' != board[j][i]) {
					if (!set.add(board[j][i])) {
						return false;
					}
				}
			}
			set.removeAll(set);
		}
		return true;
	}

	// 定义一个方法判断方块分区上是否有重复
	@SuppressWarnings("all")
	public static boolean zoneIsValid(char[][] board) {
		Set[] sets = new HashSet[9];
		for (int i = 0; i < sets.length; i++) {
			sets[i] = new HashSet();
		}
		// 内外层都循环固定9次
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				if ('.' != board[i][j]) {
					if (!sets[zone(i, j)].add(board[i][j])) {
						return false;
					}
				}
			}
		}
		return true;
	}

	// 定义一个方法用来判断方块分区 char[m][n]
	public static int zone(int m, int n) {
		if (m >= 0 && m <= 2) {
			if (n >= 0 && n <= 2) {
				return 0;
			} else if (n >= 3 && n <= 5) {
				return 1;
			} else if (n >= 6 && n <= 8) {
				return 2;
			}
		} else if (m >= 3 && m <= 5) {
			if (n >= 0 && n <= 2) {
				return 3;
			} else if (n >= 3 && n <= 5) {
				return 4;
			} else if (n >= 6 && n <= 8) {
				return 5;
			}
		} else if (m >= 6 && m <= 8) {
			if (n >= 0 && n <= 2) {
				return 6;
			} else if (n >= 3 && n <= 5) {
				return 7;
			} else if (n >= 6 && n <= 8) {
				return 8;
			}
		}
		return -1;
	}

	// 定义一个方法判断方块分区上是否有重复(只使用一个Set)
	@SuppressWarnings("all")
	public static boolean zoneIsValidWithOneSet(char[][] board) {
		Set set = new HashSet();
		// 区域1
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 以此类推
		// 区域2
		for (int i = 0; i <= 2; i++) {
			for (int j = 3; j <= 5; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域3
		for (int i = 0; i <= 2; i++) {
			for (int j = 6; j <= 8; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域4
		for (int i = 3; i <= 5; i++) {
			for (int j = 0; j <= 2; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域5
		for (int i = 3; i <= 5; i++) {
			for (int j = 3; j <= 5; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域6
		for (int i = 3; i <= 5; i++) {
			for (int j = 6; j <= 8; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域7
		for (int i = 6; i <= 8; i++) {
			for (int j = 0; j <= 2; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域8
		for (int i = 6; i <= 8; i++) {
			for (int j = 3; j <= 5; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域9
		for (int i = 6; i <= 8; i++) {
			for (int j = 6; j <= 8; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		set.removeAll(set);
		// 区域1
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if ('.' != board[i][j]) {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
