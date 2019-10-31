package 第二次讨论课;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//已知十个投票人、三个候选人，统计候选人得票数和分别来自教师、学生职工的票数。并输出无效票数
public class Thiking4 {
	private static char A='A';
	private static char One='1';
	public static  void main(String[] args) {
		int result[][]=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				result[i][j]=0;
		List<String> invalid=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()) {
			String string=scanner.nextLine();
			char f=string.charAt(0);
			char s=string.charAt(1);
			if((int)f-(int)A<0||(int)f-(int)A>2||(int)s-(int)One<0||(int)s-(int)One>2) {
				invalid.add(string);
			}else {
				result[(int)f-(int)A][(int)s-(int)One]++;
			}
		}
		scanner.close();
		System.out.println("Li的总票数为"+(result[0][0]+result[0][1]+result[0][2]));
		System.out.println("来自教师的票有"+result[0][0]+"\t来自学生的票有"+result[0][1]+"\t来自职工的票有"+result[0][2]);
		System.out.println("Zhang的总票数为"+(result[1][0]+result[1][1]+result[1][2]));
		System.out.println("来自教师的票有"+result[1][0]+"\t来自学生的票有"+result[1][1]+"\t来自职工的票有"+result[1][2]);
		System.out.println("Wang的总票数为"+(result[2][0]+result[2][1]+result[2][2]));
		System.out.println("来自教师的票有"+result[2][0]+"\t来自学生的票有"+result[2][1]+"\t来自职工的票有"+result[2][2]);
		System.out.println("无效的票数为"+invalid.size());
	}
}	
