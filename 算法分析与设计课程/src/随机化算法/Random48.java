package ������㷨;

public class Random48 {
	private static final long A = 25_214_903_917L;
	private static final long B = 48;
	private static final long C = 11;
	private static final long M = (1L << B);//M=2��B�η�
	private static final long MASK = M - 1;//MASK�ĵ�λ48����ȫ��1�����Ǹ�MASK����һ�ΰ�λ������͵õ�һ��48���صĽ��

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
