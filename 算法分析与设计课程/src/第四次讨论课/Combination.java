package 第四次讨论课;

import java.util.ArrayList;
import java.util.List;

/*
 * 思考题9 组合问题:输出从m个正整数(1--m)中任取n个数的所有组合
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
