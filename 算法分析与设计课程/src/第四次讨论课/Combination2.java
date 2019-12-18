package 第四次讨论课;


public final class Combination2 {
	private static int count=0;
	private static int len=0;
	public static void f(int m,int n,int[] result) {
		if(n==1) {
			for(int i=m;i>0;i--) {
				result[len++]=i;
				count++;
				for (int k=0;k<len;k++) {
					System.out.printf("%4d",result[k]);
				}
				System.out.println();
				result[--len]=0;
			}
		}else {
			for(int j=m;j>=n;j--) {
				result[len++] = j;
				f(j - 1, n - 1, result);
				result[--len] = 0;
			}
		}
		
	}

	public static void main(String[] args) {
		int result[]=new int[100];
		f(5, 3,result);
		System.out.println("总共有"+count+"种组合");
		//System.out.println(len);
	}
}
