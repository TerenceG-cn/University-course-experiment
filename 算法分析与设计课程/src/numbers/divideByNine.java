package numbers;
//思考题2：被九整除

//比如判断 111302154 能否被 9 整除：
//4+5(101−1+1)+1(102−1+1)+2(103−1+1)+3(105−1+1)+1(106−1+1)+1(107−1+1)+1(108−1+1)≡4+5+1+2+3+1+1+1=18
//等价于判断，一个十进制数的各位之和是否能被 9 整除；
public class divideByNine {
	public static void main(String[] args) {
		int n=100;
		int i;
		int sum=0,count=0;
		for(i=1;i<n;i++) {
			sum+=i;
			if(sum%9==0)
			{
				count++;
				for(int b=1;b<=i;b++)
					System.out.print(""+b);
				System.out.println();
			}
		}
		System.out.println("取n=？时一共有"+count+"个这样的数 ");
	}
}
//结果：
//12345678
//123456789
//1234567891011121314151617
//123456789101112131415161718
//1234567891011121314151617181920212223242526
//123456789101112131415161718192021222324252627
//1234567891011121314151617181920212223242526272829303132333435
//123456789101112131415161718192021222324252627282930313233343536
//1234567891011121314151617181920212223242526272829303132333435363738394041424344
//123456789101112131415161718192021222324252627282930313233343536373839404142434445
//1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253
//123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354
//1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162
//123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263
//1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162636465666768697071
//123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172
//1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162636465666768697071727374757677787980
//123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081
//1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162636465666768697071727374757677787980818283848586878889
//123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990
//1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162636465666768697071727374757677787980818283848586878889909192939495969798
//123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899

