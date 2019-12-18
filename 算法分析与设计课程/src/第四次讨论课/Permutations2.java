package 第四次讨论课;

import 分治法与递归.Allpermutations;

public class Permutations2 {
	private static int len = 0;

	static void f(int m, int n, int[] result) {
		if (n == 1) {
			for (int i = m; i > 0; i--) {
				result[len++] = i;

				Allpermutations.f(0, len - 1, result);

				result[--len] = 0;
			}
		} else {
			for (int j = m; j >= n; j--) {
				result[len++] = j;
				f(j - 1, n - 1, result);
				result[--len] = 0;
			}
		}

	}

	public static void main(String[] args) {
		int[] a = new int[100];
		f(3, 2, a);
	}
}
