package demo01;

import java.util.Scanner;

public class demo004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int balance = 0;
		while(true)
		{
			System.out.print("��Ͷ�ң�");
			int amount = in.nextInt();
			balance = balance + amount;//�ۼ�
			System.out.println(amount>=10);
			
			if(balance>=10) {
				System.out.println("****************");
				System.out.println("Java�Ǽ���·ר��");
				System.out.println("  ��ָ����λƱ  ");
				System.out.println("   Ʊ�ۣ�10Ԫ  ");
				System.out.println("****************");
				System.out.println("���㣺"+(balance-10));
				balance = 0;
			}
			else
			{
				
			}
		}


	}

}
