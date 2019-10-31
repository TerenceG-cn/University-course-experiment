package 第三次讨论课;

import java.math.BigDecimal;
import java.util.Random;

public class Thinking8_3 {
	static void maX(int m, int n) {// n>=2
		double temp = m, i;

		double result = 0;
		int j = 0;
		while (j < 1000000000) {
			temp = m;
			Random random = new Random(j);
			// System.out.println(j);
			double x = 1.0;
			for (i = 0; i < n - 1; i++) {
				double d = random.nextDouble() * temp;
				// System.out.println(d);
				x *= d;
				temp -= d;
			}
			// System.out.println("x:"+x);
			// System.out.println("temp:"+temp);
			x *= temp;
			j++;
			result = (result > x) ? result : x;
		}
		System.out.println(result);

	}
    public static double div(double d1,double d2,int len) {// 进行除法运算
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
       return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();

    }

	public static void main(String[] args) {
		System.out.println(div(10, 3, 6));
		System.out.println(Math.pow((double)div(10, 3, 6), 3));
		maX(10, 3);
	}
}
