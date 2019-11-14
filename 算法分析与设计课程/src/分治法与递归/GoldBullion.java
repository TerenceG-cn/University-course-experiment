package 分治法与递归;

import java.util.Scanner;

/**
 * 金块问题：利用分治法找最大最小值
 * 
 * @author TerenceG
 *
 */
public class GoldBullion {
	private final static int N = 5;
	static void maxmin(int i, int j, float max[], float min[], float a[]) {
		int mid;
		float[] lmax = {0}, rmax = {0}, lmin = {0}, rmin = {0};
		if (i == j) {
			min[0] = max[0] = a[i];
		} else if (i == j - 1) {
			max[0] = a[i] > a[j] ? a[i] : a[j];
			min[0] = a[i] > a[j] ? a[j] : a[i];
		} else {
			mid = (i + j) / 2;//可改为mid=(i+2j)/3
			maxmin(i, mid, lmax, lmin, a);// 先算左边
			maxmin(mid, j, rmax, rmin, a);// 再算右边
			max[0] = (lmax[0] > rmax[0]) ? lmax[0] : rmax[0];
			min[0] = (lmin[0] < rmin[0]) ? lmin[0] : rmin[0];
		}
	}

	public static void main(String[] args) {
		int i;
		float[] a = new float[N];
		float[] max= {Float.MIN_VALUE};//java对于实参传递，是采用值传递，所以要改成数组，不能直接使用变量去计算最大值和最小值。但还是一个很蠢的办法
		float[] min= {Float.MAX_VALUE};
		Scanner scanner = new Scanner(System.in);
		System.out.printf("array a=?");
		for (i = 0; i < N; i++) {
			a[i] = scanner.nextFloat();
		}
		maxmin(0, N - 1, max, min, a);
		System.out.println("max="+max[0]+",min="+min[0]);
	}
}
