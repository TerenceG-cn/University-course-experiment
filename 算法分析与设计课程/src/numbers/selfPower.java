package numbers;

//×ÔÃÝÊýËã·¨
public class selfPower {

	public static void main(String[] args) {
		int N = 10;
		int i, j, m, n, s, t, a, b;
		int[] c = new int[N];
		for (a = 1, i = 0; i < N - 1; i++)
			a *= 10;
		b = a * 10;
		if (b == 10)
			a = 0;
		for (n = a; n < b; n++) {
			m = n;
			i = 0;
			do {
				c[i++] = m % 10;
				m /= 10;
			} while (m > 0);
			for (t = i = 0; i < N; i++) {
				for (j = 0, s = 1; j < N; j++)
					s *= c[i];
				t += s;
			}
			if (n == t)
				System.out.print(n+" ");
		}
		System.out.println();
	}

}
