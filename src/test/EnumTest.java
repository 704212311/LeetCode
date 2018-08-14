package test;

public enum EnumTest {

	ONE(1), TWO(2), THREE(3);

	private int value;

	private EnumTest(int value) {
		this.value = value;
	}

	public static EnumTest valueOf(int value) {
		switch (value) {
		case 1:
			return ONE;
		case 2:
			return TWO;
		case 3:
			return THREE;
		default:
			return null;
		}
	}

	public int value() {
		return this.value;
	}
}
