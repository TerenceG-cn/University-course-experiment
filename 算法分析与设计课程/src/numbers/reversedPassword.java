package numbers;
//思考题1：颠倒的密码
public class reversedPassword {
	public static void main(String[] args) {
		int a,b,c,d;
		for(a=0;a<10;a++)
			for(b=0;b<10;b++)
				for(c=0;c<10;c++)
					for(d=0;d<10;d++)
						if(1333*a+130*b==20*c+332*d)
							System.out.println("新密码为："+d+c+b+a);
	}
}
/*密码是2178*/
