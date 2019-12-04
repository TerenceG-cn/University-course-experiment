package practice5;

/**
 * �ʱ�䰲�ű�11������ ��8��12�� ��2��13����12��14����1��4����3��5����6��10����8��11����0,6) (5,7)
 * 
 * @author TerenceG
 *
 */
public class ActivitesTime {
	public static void main(String[] args) {
		int[][] frames = { { 8, 12, 0 }, { 2, 13, 0 }, { 12, 14, 0 }, { 1, 4, 0 }, { 3, 5, 0 }, { 6, 10, 0 },
				{ 8, 11, 0 }, { 0, 6, 0 }, { 5, 7, 0 }, { 3, 7, 0 }, { 5, 9, 0 } };
		timeTable(frames);
	}

	/**
	 * �����
	 * 
	 * @param time_frame �ʱ���
	 */
	public static void timeTable(int[][] time_frame) {
		sort(time_frame, 0, time_frame.length - 1);// �Ի����ʱ����������
		System.out.println("���лΪ��");
		for (int i = 0; i < time_frame.length; i++) {
			System.out.print("(" + time_frame[i][0] + "," + time_frame[i][1] + ")");
		}
		int len = time_frame.length;
		int tmp = 0, count = 1;
		time_frame[0][2] = 1;
		for (int i = 1; i < len; i++)
			if (time_frame[i][0] > time_frame[tmp][1]) {
				time_frame[i][2] = 1;
				tmp = i;
				count++;
			}
		System.out.println("\n��ѡ�Ϊ��");
		for (int k = 0; k < len; k++)
			if (time_frame[k][2] == 1) {
				System.out.print("(" + time_frame[k][0] + "," + time_frame[k][1] + ") ");
			}
		System.out.println("����" + count + "��");
	}

	/**
	 * �Ի����ʱ����������
	 * 
	 * @param a
	 * @param low
	 * @param high
	 */
	private static void sort(int[][] a, int low, int high) {
		if (low > high)
			return;
		int i = low, j = high + 1;// j=high+1;
		int mark = a[low][1];
		while (true) {
			while (a[++i][1] < mark)
				if (i == high)
					break;
			while (a[--j][1] > mark)
				if (j == low)
					break;
			if (i >= j)
				break;

			int[] tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}

		int[] tmp2 = a[j];
		a[j] = a[low];
		a[low] = tmp2;

		sort(a, low, j - 1);
		sort(a, j + 1, high);
	}
}
