package algorithm.junior;

import java.util.HashMap;

/**
 * 动归思路解决爬楼梯问题
 */
public class Alg_021 {

	public static void main(String[] args) {
		// n级楼梯，每次只能爬1或者2级楼梯，问多少种方法爬到n级
		long n = 100;
//		long currentTimeMillis1 = System.currentTimeMillis();
//		System.out.println(getWays_01(n));
//		long currentTimeMillis2 = System.currentTimeMillis();
//		System.out.println("耗时：" + (currentTimeMillis2 - currentTimeMillis1));
//
//		long currentTimeMillis3 = System.currentTimeMillis();
//		System.out.println(getWays_02(n));
//		long currentTimeMillis4 = System.currentTimeMillis();
//		System.out.println("耗时：" + (currentTimeMillis4 - currentTimeMillis3));

		long currentTimeMillis5 = System.currentTimeMillis();
		System.out.println(getWays_03(n));
		long currentTimeMillis6 = System.currentTimeMillis();
		System.out.println("耗时：" + (currentTimeMillis6 - currentTimeMillis5));
	}

	// 方法一：递归
	// 思路：假设台阶100级，则最后一步有两种走法 1级和2级台阶
	// 故走到100级的方法数等于 走到99级的方法数+走到98级的方法数
	// 即得出结论：f(n)=f(n-1)+f(n-2)
	public static long getWays_01(long n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return getWays_01(n - 1) + getWays_01(n - 2);
	}

	// 方法二：备忘录
	// 思路：纯递归有大量重复计算，走到99级的方法和走到98级的方法中包含大量重复的计算
	// 故使用Map保存已计算参数，减少时间复杂度
	public static long getWays_02(long n) {
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		if (map.containsKey(n)) {
			return map.get(n);
		}
		long value = getWays_02(n - 1) + getWays_02(n - 2);
		map.put(n, value);

		return value;
	}

	// 方法三：动归
	// 思路：从下往上思考，走到3级=走到2级+走到1级，走到4级=走到3级+走到2级
	// 即只需要考虑前两位的数值，极大地简化了空间复杂度
	public static long getWays_03(long n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		long fst = 1;
		long snd = 2;
		long result = 0;
		for (long i = 3; i <= n; i++) {
			result = snd + fst;
			fst = snd;
			snd = result;
		}

		return result;
	}
}
