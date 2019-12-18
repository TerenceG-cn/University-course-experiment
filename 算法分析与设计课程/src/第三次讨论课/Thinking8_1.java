package 第三次讨论课;

import java.util.Scanner;

public class Thinking8_1 {
	//整数分拆个数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int temp = integerhuafen(n, m);
			System.out.print(temp);
		}
	}

	public static int integerhuafen(int n, int m) {

		int dp[][] = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1) {
					dp[i][j] = 1;
				} else if (i == j) {
					dp[i][j] = 1 + dp[i][j - 1];
				} else if (i < j) {
					dp[i][j] = dp[i][i];
				} else {
					dp[i][j] = dp[i - j][j] + dp[i][j - 1];
				}
			}
		}
		return dp[n][m];
	}
}
