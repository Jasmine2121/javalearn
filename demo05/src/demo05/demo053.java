package demo05;

import java.util.Scanner;

public class demo053 {

	public static void main(String[] args) {
		//平均数
		Scanner in = new Scanner(System.in);
		int x;
		//创建数组
		int[] numbers= new int[100];//记录曾经读进来的数
		double sum=0;
		int cnt=0;
		x= in.nextInt();
		while(x!=-1)
		{
			numbers[cnt]=x;
			//numbers[0]=x;存进去
			sum +=x;
			cnt++;
			x=in.nextInt();
		}
		if(cnt>0)
		{
			double average = sum/cnt;
			for(int i=0; i<cnt; i++)
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(average);

		}

	}

}
