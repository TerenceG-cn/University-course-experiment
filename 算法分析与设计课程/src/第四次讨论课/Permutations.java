package 第四次讨论课;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import 分治法与递归.Allpermutations;

/*
 * 思考题10
 * 排列问题：输出从m个正整数(1--m)中任取n个数的所有排列
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
		System.out.println("运行时间："+(end.getTime()-start.getTime()));
	}

}
