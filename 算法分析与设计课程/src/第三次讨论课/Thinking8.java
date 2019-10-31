package 第三次讨论课;

import java.util.Scanner;

//题目；一个整数分成若干个数之和，当这些数相等时，乘积最大
public class Thinking8 {
	// 先考虑整数分拆个数
	static int Partition(int num) {
		// 本题若采用递归会导致内存不足无法完成，所以采用空间换时间，用数组递推。
		for (int i = 1; i <= num; i++) {
//本题思路：若是奇数，则与上一个偶数值相等（只是上个偶数+1的结果），若是偶数，则分为拆分结果有无1.
			if ((i % 2) == 1) // 注意是判断i的奇偶性，不是a[i]
				a[i] = a[i - 1];
			else
				a[i] = (a[i - 1] + a[i / 2]) % 1000000000;
		}
		return a[num];
	}

	static int[] a = new int[1000001];

	public static void main(String[] args) {
		a[0] = 1;
		a[1] = 1;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
			int num = (int) sc.nextLong();
			System.out.println(Partition(num) % 1000000000);
		}
	}
}
