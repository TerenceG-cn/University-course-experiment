package ���������ۿ�;

//����һ������������ֳ�������������֮�ͣ�ʹ��Щ��ĳ˻���󻯣������õ����˻���
public class Thinking8_2 {
	public static long integerBreak(int n) {
		// int flag = 0;// �ж�n%6����ż��
		if (n < 2)
			return 0;
		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		int count3 = n / 3;
//		if ((n - 3 * count3) == 1)
//			count3--;
//		int count2 = (n - count3 * 3) / 2;
//		return (int) (Math.pow(3, count3)) * (int) (Math.pow(2, count2));
		if ((n % 6) % 2 == 0) {
			return (long)(Math.pow(3, (n / 6) * 2) * Math.pow(2, (n % 6) / 2));
		} else {
			return (long)(3 * Math.pow(3, ((n - 3) / 6) * 2) * Math.pow(2, ((n - 3) % 6) / 2));
		}
	}

	public static long integerBreak2(int n) {// 1~59
		if (n == 2 || n == 3)
			return n - 1;
		if (n == 4)
			return 4;
		n -= 5;
		return (long) Math.pow(3, (n / 3 + 1)) * (n % 3 + 2);
	}

	public static void main(String[] args) {
//		for (int i = 2; i < 89; i++) {
//			if (integerBreak(i) != integerBreak2(i))
//				System.out.println(i);
//		}
		System.out.println(integerBreak(119));//1`119
		System.out.println(integerBreak2(58));
		
		System.out.println(Math.pow(3, 80));

	}
}
