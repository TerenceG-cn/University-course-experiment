package 第二次讨论课;

import java.util.Random;
import java.util.Scanner;

public class Thinking5 {

	public static void main(String[] args) {
		int i=1;
		Scanner scanner=new Scanner(System.in);
		int seed=scanner.nextInt();
		Random random=new Random(seed);
		int fn=random.nextInt(100)%6+1;
		int sn=random.nextInt(100)%6+1;
		System.out.println("第"+i+"轮游戏 fn+sn=?"+fn+"+"+sn+"="+(fn+sn));
		if(fn+sn==7||fn+sn==11) {
			System.out.println("You win!");
		}else if(fn+sn==2||fn+sn==3||fn+sn==12) {
			System.out.println("You lose!");
		}else {
			int target=fn+sn;
			do {
				i++;
				fn=random.nextInt(100)%6+1;
				sn=random.nextInt(100)%6+1;
				System.out.println("第"+i+"轮游戏 fn+sn=?"+fn+"+"+sn+"="+(fn+sn));
				if(fn+sn==7) {
					System.out.println("You lose!");
					return;
				}
			}while(target!=fn+sn);
			System.out.println("You win!");
		}
	}

}
