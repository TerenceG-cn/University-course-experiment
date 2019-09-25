package numbers;

import java.util.Scanner;

//½øÖÆ×ª»»
public class MoronicCowmpouter {
	private static final int M = 5000;

	private static void f1(int m, int k) {
		int i = 0;
		int s[] = new int[30];
		String t = "0123456789abcdef";
		do {
			s[i++] = m % k;
			m /= k;
		} while (m > 0);
		for (i--; i >= 0; i--)
			System.out.print(t.charAt(s[i]));
	}

	private static void f2(double n, int k) {
		int i;
		int[] s = new int[5];
		String t = "0123456789abcdef";
		for (i = 0; i < 5; i++) {
			s[i] = (int) (n * k);
			n = n * k - s[i];
		}
		System.out.print(".");
		for (i = 0; i < 5; i++)
			System.out.print(t.charAt(s[i]));
		System.out.println("(" + k + ")");
	}

	public static void main(String[] args) {
		int k;
		int a;
		double x, b;
		System.out.print("x,k=?");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			x = scanner.nextDouble();
			k = scanner.nextInt();
			// if(x<0||k<2||k>16) goto next
			a = (int) x;
			b = x - a;
			f1(a, k);
			f2(b, k);
		}
	}

}
