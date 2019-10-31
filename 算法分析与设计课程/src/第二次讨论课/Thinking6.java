package 第二次讨论课;

public class Thinking6 {
	public static void main(String[] args) {
		int ma,niu,ji,hou,tu,yang,gou;
		int flag=1;
		int nums[]=new int[10];
		for(int i=0;i<nums.length;i++) {
			nums[i]=0;
		}
		//10*ma+hou-ji==niu
		//11*ma+hou=11*hou
		//ji/tu=tu
		//niu+yang=gou
		int i=0;
		int temp=0;
		do {
			hou=temp;
			ma=i++;
			temp=11*ma-11*ma;
		}while(i<10||hou!=temp);
		System.out.println("hou,temp="+hou+","+temp);
		//hou=0
		nums[hou]=1;
		for(i=0;i<nums.length&&i*i<10;i++) {
			if(nums[i]==1) {
				continue;
			}
			tu=i;
			ji=tu*tu;
			nums[tu]=1;
			nums[ji]=1;
			for(int j=0;j<nums.length;j++) {
				ma=j;
				nums[ma]=1;
				if(10*ma+hou-ji<10&&10*ma+hou-ji>-1) {
					niu=10*ma+hou-ji;
					System.out.println("niu:"+niu);
					nums[niu]=1;
					for(int k=0;k<nums.length-niu;k++) {
						if(nums[k]==1) {
							continue;
						}
						yang=k;
						gou=niu+yang;
						System.out.println("yang:"+yang);
						System.out.println("gou:"+gou);
						nums[yang]=1;
						nums[gou]=1;
						for(int l=0;l<10;l++) {
							if(nums[l]>2) {
								flag=0;
							}
						}
						if(flag==1) {
							System.out.println("和"+ma+niu+yang+ji+gou+tu+hou);
						}
						nums[yang]=0;
						nums[gou]=0;
					}
					nums[niu]=0;
				}
				nums[ma]=0;
			}
			nums[tu]=0;
			nums[ji]=0;
		}
	}	
}
