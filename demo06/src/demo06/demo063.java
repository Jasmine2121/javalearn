package demo06;

import java.util.Scanner;

public class demo063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] primes = new int[50];
		//��50������������������
		primes[0]=2;
		int cnt=1;//�Ѿ����ٸ�����
		//��һ��Ҫ�Ž�ȥ�ۼ�
		MAIN_LOOP:
		for(int x=3; cnt<50; x++)
		{
			for(int i=0; i<cnt; i++)
			{
				//������������
				if(x%primes[i]==0)
				{
					continue MAIN_LOOP;
				}
			}
			primes[cnt++] = x;
		}
		//����������
		for(int k:primes)
		{
			System.out.print(k+" ");
		}
	}
}
