package demo04;

import java.util.Scanner;

public class demo041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		int i=1;
		int factor = 1;//初始化阶乘的变量
//		while(i<=n)
//		{
//			factor = factor * i;
//			i = i+1;
//		}
		for( int i=1 ; i<=n ; i++ )
		{
			factor *= i;
		}
		System.out.println(factor);
	}

}
