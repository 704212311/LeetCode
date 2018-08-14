package algorithm.junior;

/**
 * 计数质数
 */
public class Alg_014 {

	public static void main(String[] args) {
		// TODO
		String 超时;

		System.out.println(countPrimes(2));
		System.out.println(countPrimes(3));
		System.out.println(countPrimes(4));
		System.out.println(countPrimes(5));
		System.out.println(countPrimes(6));
		System.out.println(countPrimes(7));
		System.out.println(countPrimes(8));
		System.out.println(countPrimes(9));
		System.out.println(countPrimes(10));
	}

	// 超时方法↓

	public static int countPrimes(int n) {
		if (n < 2) {
			return 0;
		}
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	// 判断是否为质数
	public static boolean isPrime(int x) {
		if (x <= 1) {
			return false;
		}
		if ((x != 2 && x % 2 == 0) || (x != 3 && x % 3 == 0) || (x != 5 && x % 5 == 0)) {
			return false;
		}
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
