package ���Ĵ����ۿ�;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ���η���ݹ�.Allpermutations;

/*
 * ˼����10
 * �������⣺�����m��������(1--m)����ȡn��������������
 */
public class Permutations {

	static void f(int m,int n,List<Integer> result,int a[]) {
		int k;
		if(n==1) {
			for(int i=m;i>0;i--) {
				result.add(i);
//				for (Integer integer : result) {
//					System.out.printf("%4d",integer);
//				}
//				System.out.println();
				k=0;
				for (Integer iInteger : result) {
					a[k++]=iInteger;
				}
				Allpermutations.f(0, k-1, a);
				
				result.remove(result.size()-1);
			}
		}else {
			for(int j=m;j>=n;j--) {
				result.add(j);
				f(j-1, n-1,result, a);
				result.remove(result.size()-1);
			}
		}
		
	}
	public static void main(String[] args) {
		List<Integer> result=new ArrayList<Integer>();
		int[] a= new int[100];
		Date start=new Date();
		f(10, 7, result, a);
		Date end=new Date();
		System.out.println("����ʱ�䣺"+(end.getTime()-start.getTime()));
	}

}
