package logicals;

public class SwapWithout3rdVariable {
	public static void main(String[] args) {
		int a = 60;
		int b = 100;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}
}
