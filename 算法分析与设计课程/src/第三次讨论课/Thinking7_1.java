package 第三次讨论课;

public class Thinking7_1 {
	static void findR(int m) {
		int n=0,i=0,x=0;
		int a[]=new int[m+1];
		for(i=0;i<m;i++)
			a[i]=1;
		for(i=1;i<1000;i++)
		{
			n+=i;
			x=n%m;
			a[x]=0;
		}
		System.out.println("当m为"+m+"时，");
		for(i=0; i<m; i++)  /*输出结果*/
	    {
	        if(a[i]!=0)
	        	System.out.printf("可能在第%d个洞\n", i);
	    }
	}
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			findR(i);
		}
	}
}
