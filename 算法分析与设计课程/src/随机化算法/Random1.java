package Ëæ»ú»¯Ëã·¨;

public class Random1 {

	private static final int A = 48271;
	private static final int M = 2147483647;

	public Random1() {
		state = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
	}

	public int randomInt() {// WRONG
		return state = (A * state) % M;
	}

	public double random0_1() {
		return (double) randomInt() / M;
	}

	private int state;

}
