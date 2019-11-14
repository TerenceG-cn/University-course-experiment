package 第二次讨论课;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��֪ʮ��ͶƱ�ˡ�������ѡ�ˣ�ͳ�ƺ�ѡ�˵�Ʊ���ͷֱ����Խ�ʦ��ѧ��ְ����Ʊ�����������ЧƱ��
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
		System.out.println("Li����Ʊ��Ϊ"+(result[0][0]+result[0][1]+result[0][2]));
		System.out.println("���Խ�ʦ��Ʊ��"+result[0][0]+"\t����ѧ����Ʊ��"+result[0][1]+"\t����ְ����Ʊ��"+result[0][2]);
		System.out.println("Zhang����Ʊ��Ϊ"+(result[1][0]+result[1][1]+result[1][2]));
		System.out.println("���Խ�ʦ��Ʊ��"+result[1][0]+"\t����ѧ����Ʊ��"+result[1][1]+"\t����ְ����Ʊ��"+result[1][2]);
		System.out.println("Wang����Ʊ��Ϊ"+(result[2][0]+result[2][1]+result[2][2]));
		System.out.println("���Խ�ʦ��Ʊ��"+result[2][0]+"\t����ѧ����Ʊ��"+result[2][1]+"\t����ְ����Ʊ��"+result[2][2]);
		System.out.println("��Ч��Ʊ��Ϊ"+invalid.size());
	}
}	
