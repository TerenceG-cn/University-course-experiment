package numbers;

import java.util.Arrays;

public class Kaprekar {

	public static void main(String[] args) {
		final int N=4;
		int n1 = 1234, n2 = 0;
		do {
			int tmp=n1;
			int i = 0, a = 0, b = 0;
			int nums[] = new int[N];
			do {
				nums[i++] = tmp % 10;
				tmp /= 10;
			} while (tmp > 0);

			Arrays.sort(nums);
			a = nums[0] * 1000 + nums[1] * 100 + nums[2] * 10 + nums[3];
			b = nums[3] * 1000 + nums[2] * 100 + nums[1] * 10 + nums[0];
			n2 = n1;
			n1 = b - a;
//			System.out.println(n1);
//			System.out.println(n2);
		} while (n1 != n2);
		System.out.println(n1);
	}
}
