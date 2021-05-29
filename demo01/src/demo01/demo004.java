package demo01;

import java.util.Scanner;

public class demo004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int balance = 0;
		while(true)
		{
			System.out.print("请投币：");
			int amount = in.nextInt();
			balance = balance + amount;//累加
			System.out.println(amount>=10);
			
			if(balance>=10) {
				System.out.println("****************");
				System.out.println("Java城际铁路专线");
				System.out.println("  无指定座位票  ");
				System.out.println("   票价：10元  ");
				System.out.println("****************");
				System.out.println("找零："+(balance-10));
				balance = 0;
			}
			else
			{
				
			}
		}


	}

}
