package test;

public class Test {

	public static void main(String[] args) {
		test();
	}

	public static String func(String s) {
		s += "tail";
		return s;
	}

	public static void test() {
		String a = "abc";
		func(a);
		System.out.println(a);
	}
}
