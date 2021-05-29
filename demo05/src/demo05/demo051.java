package demo05;

import java.util.Scanner;

public class demo051 {

	public static void main(String[] args) {
		// 最大公约数
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int gcd = 1;
		for(int i=2; i<=a && i<=b; i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("a和b的最大公约数是"+gcd);
	}

}
