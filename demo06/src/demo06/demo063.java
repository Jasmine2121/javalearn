package demo06;

import java.util.Scanner;

public class demo063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] primes = new int[50];
		//将50个素数放入数组里面
		primes[0]=2;
		int cnt=1;//已经多少个素数
		//下一个要放进去累加
		MAIN_LOOP:
		for(int x=3; cnt<50; x++)
		{
			for(int i=0; i<cnt; i++)
			{
				//遍历所有素数
				if(x%primes[i]==0)
				{
					continue MAIN_LOOP;
				}
			}
			primes[cnt++] = x;
		}
		//有了素数表
		for(int k:primes)
		{
			System.out.print(k+" ");
		}
	}
}
