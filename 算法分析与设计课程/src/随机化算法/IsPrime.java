package 随机化算法;

import java.util.Random;

public class IsPrime {
	private static long witness(long a, long i, long n) {
		if (i == 0)
			return 1;
		long x = witness(a, i / 2, n);
		if (x == 0)
			return 0;
		long y = (x * x) % n;
		if (y == 1 && x != 1 && x != n - 1)
			return 0;
		if (i % 2 != 0)
			y = (a * y) % n;
		return y;
	}

	public static final int TRIALS = 5;// 随机原始测试中查询的数

	public static boolean isPrime(long n) {
		Random r = new Random();

		for (int counter = 0; counter < TRIALS; counter++)
			if (witness(randomLong(r, n - 4)+2, n - 1, n) != 1)
				return false;
		return true;
	}

	public static long randomLong(Random rng, long n) {
		// error checking and 2^x checking removed for simplicity.
		long bits, val;
		do {
			bits = (rng.nextLong() << 1) >>> 1;
			val = bits % n;
		} while (bits - val + (n - 1) < 0L);
		return val;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(1001));
		System.out.println(isPrime(97));
	}
}
