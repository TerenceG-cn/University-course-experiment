package numbers;

import java.util.Scanner;

//表示阶乘大数
public class Factorial {
	private static final int M = 5000;

	private static int f1(int k, int[] a, int p) {
		int c = p, i, m, r;
		int[] b = new int[M];
		for (i = 0; i < c; i++) {
			b[i] = a[i];
			// System.out.print("b[" + i + "] " + "= a[" + i + "] = " + a[i]);
		}
		a[c] = 0;
		for (m = 1; m < k; m++)
			for (i = 0; i < c; i++) {
				r = a[i] + b[i];
				a[i] = r % 10;
				a[i + 1] += r / 10;
				// System.out.print("(m=" + m + ", i=" + i + ") r=a[" + i + "]+b[" + i + "]=" +
				// a[i] + " + " + b[i] + " = " + r);
			}
		r = a[c];
		while (r > 0) {
			a[c++] = r % 10;
			r /= 10;
		}
		return c;// return a[]
	}

	private static int f2(int k, int[] a, int c) {
		int i;
		System.out.print(k + "! = ");
		for (i = c - 1; i >= 0; i--)
			System.out.print(a[i]);
		System.out.println("(" + c + ")");
		return c;
	}

	public static void main(String[] args) {
		int n, c, k;
		int[] a = new int[M];
		System.out.print("n=?");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		a[0] = 1;
		c = 1;
		c = f2(1, a, c);
		for (k = 2; k <= n; k++) {
			c = f1(k, a, c);
			c = f2(k, a, c);
		}
		scanner.close();
	}
}
/*
 * 170! = 7257415615307998967396728211129263114716991681296451376543577798900
 * 56184340170615785235074924261745951149099123783852077666602256544275302532
 * 89007732075109024004302800582956039666125996582571043985582942575689663134
 * 39612262571094946806711205568880457193340212661452800000000000000000000000
 * 000000000000000000(307)
 */
