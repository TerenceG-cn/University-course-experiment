package numbers;

import java.util.Scanner;

public class KaprekarClass {
	static final int N = 5;

	public static void main(String[] args) {
		int b, c, d, i, j, k, n, s, t, fg;
		int[] a = new int[N];
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();// 输入一个N位数
		do {
			i = fg = 0;
			s = n;//记录n原值
			do {
				a[i++] = n % 10;
				n /= 10;
			} while (n > 0);// 分离数字
			for (j = i; j < N; j++)
				a[j] = 0;// 数位不足补0
			for (i = 0; i < N - 1; i++)
				for (j = i + 1; j < N; j++)
					if (a[i] < a[j]) {
						t = a[i];
						a[i] = a[j];
						a[j] = t;// 顺序变换，调整数组顺序，从大到小
					}
			for (i = N - 1, b = 0, k = 1; i >= 0; i--) {
				b += a[i] * k;//大数
				k *= 10;
			}
			for(i=c=0,k=1;i<N;i++) {
				c+=a[i]*k;k*=10;//小数
			}
			d=b-c;//新数
			if(s!=d) {
				System.out.println(b+" - "+c+" = "+d);
			}
			n=d;
			fg=1;
		} while (fg > 0);
		scanner.close();
	}
}
