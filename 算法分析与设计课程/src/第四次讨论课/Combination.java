package ���Ĵ����ۿ�;

import java.util.ArrayList;
import java.util.List;

/*
 * ˼����9 �������:�����m��������(1--m)����ȡn�������������
 */
public class Combination {
	private static int count=0;
	public static void f(int m,int n,List<Integer> result) {
		if(n==1) {
			for(int i=m;i>0;i--) {
				result.add(i);
				count++;
				for (Integer integer : result) {
					System.out.printf("%4d",integer);
				}
				System.out.println();
				result.remove(result.size()-1);
			}
		}else {
			for(int j=m;j>=n;j--) {
				result.add(j);
				f(j-1, n-1,result);
				result.remove(result.size()-1);
			}
			///f(m-1, n-1);
		}
		
	}

	public static void main(String[] args) {
		List<Integer> resIntegers=new ArrayList<Integer>();
		f(5, 4,resIntegers);

	}

}
