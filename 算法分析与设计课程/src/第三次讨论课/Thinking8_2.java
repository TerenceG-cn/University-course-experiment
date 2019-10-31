package 第三次讨论课;

//给定一个正整数，拆分成至少两个整数之和，使这些项的乘积最大化，输出获得的最大乘积。
public class Thinking8_2 {
	public static long integerBreak(int n) {
		// int flag = 0;// 判断n%6的奇偶性
		if (n < 2)
			return 0;
		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		int count3 = n / 3;
//		if ((n - 3 * count3) == 1)
//			count3--;
//		int count2 = (n - count3 * 3) / 2;
//		return (int) (Math.pow(3, count3)) * (int) (Math.pow(2, count2));
		if ((n % 6) % 2 == 0) {
			return (long)(Math.pow(3, (n / 6) * 2) * Math.pow(2, (n % 6) / 2));
		} else {
			return (long)(3 * Math.pow(3, ((n - 3) / 6) * 2) * Math.pow(2, ((n - 3) % 6) / 2));
		}
	}

	public static long integerBreak2(int n) {// 1~59
		if (n == 2 || n == 3)
			return n - 1;
		if (n == 4)
			return 4;
		n -= 5;
		return (long) Math.pow(3, (n / 3 + 1)) * (n % 3 + 2);
	}

	public static void main(String[] args) {
//		for (int i = 2; i < 89; i++) {
//			if (integerBreak(i) != integerBreak2(i))
//				System.out.println(i);
//		}
		System.out.println(integerBreak(119));//1`119
		System.out.println(integerBreak2(58));
		
		System.out.println(Math.pow(3, 80));

	}
}
