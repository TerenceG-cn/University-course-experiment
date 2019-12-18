package Ëæ»ú»¯Ëã·¨;

public class Random2 {
	private static final int A = 48271;
	private static final int M = 2147483647;
	private static final int Q = M / A;
	private static final int R = M % A;

	public Random2() {
		state = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
	}

	public int randomInt() {
		int tmpState = A * (state % Q) - R * (state / Q);
		if (tmpState >= 0)
			state = tmpState;
		else 
			state = tmpState + M;
		return state;
	}

	public double random0_1() {
		return (double) randomInt() / M;
	}

	private int state;
}
