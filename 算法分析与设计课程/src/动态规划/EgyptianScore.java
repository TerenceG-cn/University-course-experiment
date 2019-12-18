package ��̬�滮;


public class EgyptianScore {

	public static void egyptianScorez(long a, long b) {
		int flag = 0;
		long c = 0;
		if (a >= b) {
			System.out.println("input error!");
		} else if (b % a == 0) {
			System.out.printf("%d/%d=1/%d", a, b, b / a);
		} else {
			System.out.printf("%d/%d=", a, b);
			flag = 1;
			do {
				c = b / a + 1;
				a = a * c - b;
				b *= c;
				System.out.printf("1/%d+", c);
				if (b % a == 0) {
					System.out.printf("1/%d", b / a);
					flag = 0;
				}
			} while (flag == 1);
		}
		System.out.println();
	}


	private static long[] result = new long[100];
	static int i = 0;

	public static long[] egyptianS(long a, long b) {
		long c = 0;
		if (a >= b) {
			System.out.println("input error!");
		} else if (b % a == 0) {
			result[i++] = (b / a);
		} else {
			c = b / a + 1;
			a = a * c - b;
			b *= c;
			result[i++] = c;
			egyptianS(a, b);
		}
		return result;
	}

	public static void main(String[] args) {
		long a = 7, b = 8;
		// egyptianScorez(a, b);
		long res[] = egyptianS(a, b);
		StringBuilder resBuilder = new StringBuilder(a+"/"+b+" = ");
		for (int j = 0; res[j] != 0; j++) {
			resBuilder.append("1/" + res[j] + "+");
		}
		System.out.println(resBuilder.toString().substring(0,resBuilder.length()-1));
	}

}
