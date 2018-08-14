package algorithm.junior;

/**
 * 加一
 */
public class Alg_008 {

	public static void main(String[] args) {
		int[] digits = { 9, 9, 9, 9 };
		int[] plusOne = plusOne(digits);
		for (int i = 0; i < plusOne.length; i++) {
			System.out.print(plusOne[i]);
		}
	}

	public static int[] plusOne(int[] digits) {
		return plus(digits, digits.length - 1);
	}

	// 递归，第x位+1
	public static int[] plus(int[] arr, int x) {
		if (arr[x] == 9 && x > 0) {
			// 非首位为9，置零进一
			arr[x] = 0;
			return plus(arr, x - 1);
		} else if (arr[x] == 9 && x == 0) {
			// 非首位为9，新建一个长度+1的数组存放最终结果
			int[] result = new int[arr.length + 1];
			for (int i = 0; i < result.length; i++) {
				if (i == 0) {
					result[i] = 1;
				} else if (i == 1) {
					result[i] = 0;
				} else {
					result[i] = arr[i - 1];
				}
			}
			return result;
		} else {
			// 非首位不为9，加一返回
			arr[x]++;
			return arr;
		}
	}
}
