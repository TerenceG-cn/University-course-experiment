
package 分治法与递归;

import java.util.Scanner;

/*
 * 全排列：输出n个数的全排列
 */


public class Allpermutations {
	private static final int N=100;
	private static long k=0;
	public static void f(int i,int n,int[] a) {
		int j,temp;
		if(i==n) {
			for(j=0;j<=n;j++)
				System.out.printf("%4d",a[j]);
				k++;
				System.out.println();
		}else {
			for(j=i;j<=n;j++) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				f(i+1, n, a);
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	public static void main(String[] args) {
		int i,n;
		int[] a=new int[N];
		System.out.print("n=?");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n!=0) {
			System.out.print("a[]=?");
			for(i=0;i<n;i++) {
				a[i]=scanner.nextInt();
			}
			f(0,n-1,a);
		}else {
			k=1;
		}
		System.out.printf("perm(%d)=%d",n,k);
		scanner.close();
	}
}
