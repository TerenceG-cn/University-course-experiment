package 第三次讨论课;
//题目：
//一只兔子躲进了n个环形分布的洞中的一个。狼在第一个洞中没有找到兔子，
//就隔一个洞，到第3个洞去找；也没有找到，就隔2个洞，到第6个洞去找；
//以后每次多一个洞去找兔子……这样下去，如果一直找不到兔子，请问兔子可能在哪个洞中？
public class Thinking7 {
	//先考虑十个洞
	public static void main(String[] args) {
		int n=0,i=0,x=0;
		int a[]=new int[11];
		for(i=0;i<11;i++)
			a[i]=1;
		for(i=1;i<1000;i++)
		{
			n+=i;
			x=n%10;
			a[x]=0;
		}
		for(i=0; i<10; i++)  /*输出结果*/
	    {
	        if(a[i]!=0)
	        	System.out.printf("可能在第%d个洞\n", i);
	    }
	}
}
