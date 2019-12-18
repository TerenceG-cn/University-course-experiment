package ¶¯Ì¬¹æ»®;


public class NumberTower {

	public static void numberPath(int[] nums, int n) {
		int i, j, k, flag, b, l = 0;
		int[][] a = new int[50][50];
		int[][] d = new int[50][50];
		for (i = 1; i <= n; i++)
			for (j = 1; j <= i; j++) {
				a[i][j] = nums[l++];
				d[i][j] = a[i][j];
			}
		for (i = n; i >= 1; i--)
			for (j = 1; j <= i; j++)
				if (d[i + 1][j] > d[i + 1][j + 1]) {
					d[i][j] += d[i + 1][j];
				} else {
					d[i][j] += d[i + 1][j + 1];
				}
		System.out.printf("max=%d\n", d[1][1]);
		System.out.printf("%d", a[1][1]);
		b = d[1][1] - a[1][1];
		for (k = 1, i = 2; i <= n; i++)
			for (flag = 1, j = k; j <= k + 1 && flag == 1; j++)
				if (b == d[i][j]) {
					System.out.printf("->%d", a[i][j]);
					b = d[i][j] - a[i][j];
					k = j;
					flag = 0;
				}
		System.out.println();
	}

	public static void numberPath2(int[] nums, int n) {
		int i, j, k, l = 0;
		int[][] a = new int[50][50];
		int[][] d = new int[50][50];
		int[][] t = new int[50][50];
		for (i = 1; i <= n; i++)
			for (j = 1; j <= i; j++) {
				a[i][j] = nums[l++];
				d[i][j] = a[i][j];
				t[i][j] = 0;
			}
		for (i = n; i >= 1; i--)
			for (j = 1; j <= i; j++)
				if (d[i + 1][j] > d[i + 1][j + 1]) {
					d[i][j] += d[i + 1][j];
					t[i + 1][j] = 1;
				} else {
					d[i][j] += d[i + 1][j + 1];
					t[i + 1][j + 1] = 1;
				}
		System.out.printf("max=%d\n", d[1][1]);
		System.out.printf("%d", a[1][1]);

		for (k = 1, i = 2; i <= n; i++) {
			j = k;
			if (t[i][j] == 1) {
				System.out.printf("->%d", a[i][j]);
				k = j;
			} else {
				System.out.printf("->%d", a[i][j + 1]);
				k = j + 1;
			}
		}
		System.out.println();
	}
	/**
	 * 
	 * @param nums
	 * @param n
	 */
	public static void numberPath4(int[] nums, int n) {
		int i, j, k, flag, b, l = 0;
		int[][][] a = new int[50][50][4];

		for (i = 1; i <= n; i++)
			for (j = 1; j <= i; j++) {
				a[i][j][1] = nums[l++];
				a[i][j][2] = a[i][j][1];// a[i][j][3]=0;
			}
		for (i = n; i >= 1; i--)
			for (j = 1; j <= i; j++)
				if (a[i + 1][j][2] > a[i + 1][j + 1][2]) {
					a[i][j][2] += a[i + 1][j][2];
					a[i][j][3] = 0;
				} else {
					a[i][j][2] += a[i + 1][j + 1][2];
					a[i][j][3] = 1;
				}
		System.out.printf("max=%d\n", a[1][1][2]);

		for (j = i = 1; i <= n - 1; i++) {
			System.out.printf("%d->", a[i][j][1]);
			j += a[i][j][3];
		}
		System.out.printf("%d\n", a[n][j][1]);
	}

	public static void main(String[] args) {
		int[] nums = { 9, 12, 15, 10, 6, 8, 2, 18, 9, 5, 19, 7, 10, 4, 16 };
		int n = 5;
		// numberPath(nums, n);
		// numberPath2(nums, n);
		numberPath4(nums, n);
	}
}
