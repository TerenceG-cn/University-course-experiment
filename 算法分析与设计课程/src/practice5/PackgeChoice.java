package practice5;

import java.awt.image.RescaleOp;
import java.util.concurrent.CountDownLatch;

import javax.swing.text.AbstractDocument.LeafElement;
//�Ż� һά���� to do
/**
 * ��Ʒѡ������/�������� ��̬�滮 ��������N<=5000 ����������Ʒ��ѡ��ÿ����Ʒ�Ĵ������ֵ�ֱ�Ϊ3��4��2��3������������10������ܹ��õ�13
 * 
 * @author TerenceG
 *
 */
public class PackgeChoice {
	/**
	 * 
	 * @param goods //goods[i][0] ��i����Ʒ�Ĵ��� goods[i][1] ��i����Ʒ�ļ�ֵ
	 * @param N ����������
	 * 
	 */
	public static void Choice(int[][] goods, int N) {
		int len, k, l;//k����Ʒ����
		int[][] allgoods = new int[50][2];
		for (l = 0, k = 0; l < goods.length; l++) {
			len = N / goods[l][0];
			while (len > 0) {
				allgoods[k][0] = goods[l][0];
				allgoods[k++][1] = goods[l][1];
				len--;
			}

		}
		
		for (int i = 0; i < k; i++)
			System.out.printf("%2d",allgoods[i][0]);
		System.out.println();
		for (int i = 0; i < k; i++)
			System.out.printf("%2d",allgoods[i][1]);
		System.out.println();

		int[][] tmp = new int[k][N];

		for (int j = 0; j < N; j++) {
			tmp[0][j] = (allgoods[0][0] > j) ? 0 : allgoods[0][1];//��ʼ�������۱�����װ�¶���ֻ��ѡ���һ����Ʒ
		}
		for (int i = 0; i < k; i++) {
			tmp[i][0] = 0;// ����װ����Ϊ0�Ų����κ���Ʒ
		}
		
		for (int i = 1; i < k; i++) {
			for (int j = 1; j < N; j++) {
				if (allgoods[i][0] <= j) {//����Ʒ�Ĵ���С�ڵ��ڱ�������
					int tmp1 = tmp[i - 1][j];//ѡ�񲻷�
					int tmp2 = tmp[i - 1][j - allgoods[i][0]] + allgoods[i][1];//ѡ���
					tmp[i][j] = (tmp1 > tmp2) ? tmp1 : tmp2;

				} else {//����Ʒ�Ĵ��۴��ڱ�����������
					tmp[i][j] = tmp[i - 1][j];
				}
			}
		}
//      ȫ���ӡ
//		int cnt = 0;
//		for (int i = 0; i < k; i++)
//			for (int j = 0; j < N; j++) {
//				System.out.printf("%5d", tmp[i][j]);
//				if (++cnt == N) {
//					cnt = 0;
//					System.out.println();
//				}
//
//			}
		//��¼��Щ��Ʒ����������Ž�����
		int num[] = new int[k];
		for (int i = k - 1; i > 0 && N > 1; i--) {
			if (tmp[i][N - 1] == tmp[i - 1][N - 1 - allgoods[i][0]] + allgoods[i][1]) {
				num[i] = 1;
				N -= allgoods[i][0];
			} else
				num[i] = 0;
		}
		int maxValue=0;
		for (int i = 0; i < k; i++) {
			System.out.printf("%2d", num[i]);
			if(num[i]==1) maxValue+=allgoods[i][1];
		}
		System.out.println("\n����ֵΪ��"+maxValue);
	}

	public static void main(String[] args) {
		int a[][] = {{3,4},{2,3}};
		int b[][] = {{3,6},{5,8},{4,7}};
		Choice(a, 10);
		Choice(b, 27);
	}
}
