package 第四次讨论课;


public class Permutations3 {
	private static final int N = 100;
	private static long k = 0;

	public static void f(int i, int m, int n, int[] a) {
		int j, temp;
		if (i == n) {
			for (j = 0; j < n; j++)
				System.out.printf("%4d", a[j]);
			k++;
			System.out.println();
		} else {
			for (j = i; j < m; j++) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				f(i + 1, m, n, a);
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}
		}
	}

	public static void main(String[] args) {
		int m=4,n=3;
		int[] a= {1,2,3,4};
		f(0, m , n,a);
//		   1   2
//		   1   3
//		   1   4
//		   2   1
//		   2   3
//		   2   4
//		   3   2
//		   3   1
//		   3   4
//		   4   2
//		   4   3
//		   4   1
	}
}
