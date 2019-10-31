package ���������ۿ�;

import java.util.Scanner;

//��Ŀ��һ�������ֳ����ɸ���֮�ͣ�����Щ�����ʱ���˻����
public class Thinking8 {
	// �ȿ��������ֲ����
	static int Partition(int num) {
		// ���������õݹ�ᵼ���ڴ治���޷���ɣ����Բ��ÿռ任ʱ�䣬��������ơ�
		for (int i = 1; i <= num; i++) {
//����˼·������������������һ��ż��ֵ��ȣ�ֻ���ϸ�ż��+1�Ľ����������ż�������Ϊ��ֽ������1.
			if ((i % 2) == 1) // ע�����ж�i����ż�ԣ�����a[i]
				a[i] = a[i - 1];
			else
				a[i] = (a[i - 1] + a[i / 2]) % 1000000000;
		}
		return a[num];
	}

	static int[] a = new int[1000001];

	public static void main(String[] args) {
		a[0] = 1;
		a[1] = 1;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
			int num = (int) sc.nextLong();
			System.out.println(Partition(num) % 1000000000);
		}
	}
}
