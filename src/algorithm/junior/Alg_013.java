package algorithm.junior;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 */
public class Alg_013 {

	public static void main(String[] args) {
		List<String> fizzBuzz = fizzBuzz(15);
		for (String string : fizzBuzz) {
			System.out.println(string);
		}
	}

	public static List<String> fizzBuzz(int n) {
		if (n < 1) {
			return null;
		}
		List<String> result = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			StringBuffer sb = new StringBuffer("");
			if (i % 3 == 0) {
				sb.append("Fizz");
			}
			if (i % 5 == 0) {
				sb.append("Buzz");
			}
			if (i % 3 != 0 && i % 5 != 0) {
				sb.append("" + i);
			}
			result.add(sb.toString());
		}
		return result;
	}
}
