package algorithm.junior;

/**
 * 第一个错误的版本
 */
public class Alg_019 {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(5));
	}

	public static int firstBadVersion(int n) {
		return func(n);
	}

	public static int func(int n) {
		if (isBadVersion(n)) {
			return func(n / 2);
		} else {
			return func(n / 2 - 1);
		}
	}

	// 模拟isBadVersion方法
	public static boolean isBadVersion(int version) {
		if (version >= 4) {
			return true;
		}
		return false;
	}
}
