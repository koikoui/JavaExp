package exp4;

import java.util.Scanner;

public class Exp4_2 {
	
	int a[] = { 2, 4, 5, 7, 9, 11, 15, 17, 20, 22, Integer.MAX_VALUE };

	void print(boolean isAfterInsert) {
		int end = isAfterInsert ? a.length : a.length - 1;
		for (int i = 0; i < end; i++) {
			System.out.printf("%-5d", a[i]);
		}
		System.out.println();
	}

	int findInsertLocation(int x) {
		int i = 0;
		for (; i < a.length - 1; i++) {
			if (a[i] == x) {
				return -1;
			} else if (a[i] > x) {
				return i;
			}
		}
		return i;
	}

	void insert(int i, int x) {
		for (int j = a.length - 2; j >= i; j--) {
			a[j + 1] = a[j];
		}
		a[i] = x;
	}

	
	public static void main(String[] args) {
		Exp4_2 t = new Exp4_2();
		t.print(false);

		System.out.print("����Ҫ���������");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		int i = t.findInsertLocation(x);
		if (i == -1) {
			System.out.println(x + " ���������Ѿ����ڣ��������룡");
		} else {
			t.insert(i, x);
			t.print(true);
		}
		s.close();
	}
}
