package ���η���ݹ�;

import java.util.Scanner;

/**
 * ������⣺���÷��η��������Сֵ
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
			mid = (i + j) / 2;//�ɸ�Ϊmid=(i+2j)/3
			maxmin(i, mid, lmax, lmin, a);// �������
			maxmin(mid, j, rmax, rmin, a);// �����ұ�
			max[0] = (lmax[0] > rmax[0]) ? lmax[0] : rmax[0];
			min[0] = (lmin[0] < rmin[0]) ? lmin[0] : rmin[0];
		}
	}

	public static void main(String[] args) {
		int i;
		float[] a = new float[N];
		float[] max= {Float.MIN_VALUE};//java����ʵ�δ��ݣ��ǲ���ֵ���ݣ�����Ҫ�ĳ����飬����ֱ��ʹ�ñ���ȥ�������ֵ����Сֵ��������һ���ܴ��İ취
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
