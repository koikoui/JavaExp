package exp4;

public class Exp4_3 {
	void shift(int[] a) {
		int last = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = last;
	}

	void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%-5d", a[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Exp4_3 t = new Exp4_3();
		int[] a = { 7, 4, 8, 9, 1, 5 };
		t.print(a);
		for (int i = 0; i < a.length - 1; i++) {
			t.shift(a);
			t.print(a);
		}
	}
}
