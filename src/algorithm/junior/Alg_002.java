package algorithm.junior;

/**
 * 买卖股票的最佳时机 II
 */
public class Alg_002 {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = maxProfit(prices);
		System.out.println(maxProfit);
	}

	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		// 创建一个数组用来保存价格数组的相邻数之差
		int[] deff = new int[prices.length - 1];
		for (int i = 0; i < prices.length - 1; i++) {
			// 为差值数组赋值
			deff[i] = prices[i + 1] - prices[i];
		}
		int result = 0;
		for (int i = 0; i < deff.length; i++) {
			if (deff[i] > 0) {
				result += deff[i];
			}
		}
		return result;
	}
}
