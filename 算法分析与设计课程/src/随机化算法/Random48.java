package 随机化算法;

public class Random48 {
	private static final long A = 25_214_903_917L;
	private static final long B = 48;
	private static final long C = 11;
	private static final long M = (1L << B);//M=2的B次方
	private static final long MASK = M - 1;//MASK的低位48比特全是1，于是跟MASK进行一次按位与操作就得到一个48比特的结果

	public Random48() {
		state = System.nanoTime() % MASK;
	}

	public int randomInt() {
		return next(32);
	}

	public double random0_1() {
		return ((long) (next(26)) << 27) + next(27) / (double) (1L << 53);
	}

	private int next(int bits) {
		if (bits <= 0 || bits > 32)
			throw new IllegalArgumentException();
		state = (A * state + C) & MASK;
		return (int) (state >>> (B - bits));
	}

	private long state;
}
