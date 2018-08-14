package algorithm.junior;

/**
 * 3的幂
 */
public class Alg_015 {

	public static void main(String[] args) {
		System.out.println(judge(27));
	}

	public static boolean isPowerOfThree(int n) {
		if (n < 3 && n != 1) {
			return false;
		}
		return judge(n);
	}

	public static boolean judge(int n) {
		if (n == 1) {
			return true;
		}
		if (n % 3 != 0) {
			return false;
		} else {
			return judge(n / 3);
		}
	}
}
