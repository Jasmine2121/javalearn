package demo05;

import java.util.Scanner;

public class demo053 {

	public static void main(String[] args) {
		//ƽ����
		Scanner in = new Scanner(System.in);
		int x;
		//��������
		int[] numbers= new int[100];//��¼��������������
		double sum=0;
		int cnt=0;
		x= in.nextInt();
		while(x!=-1)
		{
			numbers[cnt]=x;
			//numbers[0]=x;���ȥ
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
