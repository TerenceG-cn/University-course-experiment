package practice5;

public class ActivitiesDemo {
	public static int greedySelector(int[] s, int[] f, boolean[] a) {

		int n = s.length - 1;

		a[1] = true;
		int j = 1;
		int count = 1;

		for (int i = 2; i <= n; i++) {
			if (s[i] >= f[j]) {
				a[i] = true;
				j = i;
				count++;
			} else {
				a[i] = false;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		int[] s = { 1, 3, 0, 5, 3, 3, 5, 6, 8, 8, 2, 12 };
		int[] f = { 4, 5, 6, 7, 7, 8, 9, 10, 11, 12, 13, 14 };
//		int[] s = { 8, 12, 12, 1, 3, 6, 8, 0, 5, 3, 5 };
//		int[] f = { 12, 13, 14, 4, 5, 10, 11, 6, 7, 7, 9 };
		boolean[] a = new boolean[s.length];

		int result = greedySelector(s, f, a);
		System.out.println("Result is: " + result);
		for (int i = 0; i <= s.length - 1; i++) {
			if (a[i]) {
				System.out.println("��" + i + "���ѡ�У��俪ʼʱ��Ϊ��" + s[i] + "������ʱ��Ϊ��" + f[i]);
			}
		}

	}

}
