package demo06;

import java.util.Scanner;

public class demo065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean[] isPrime = new boolean[100];
		//boolean��ʼ������FALSE
		//�Լ���ʼ��
		for(int i=0; i<isPrime.length; i++)
		{
			isPrime[i]=true;
		}
		for(int i=2; i<isPrime.length; i++)
		{
			if(isPrime[i])
			{
				for(int k = 2; i*k<isPrime.length; k++)
				{
					isPrime[i*k]=false;
				}
			}
		}
		for(int i=2; i<isPrime.length; i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
	}
}
