package demo01;

import java.util.Scanner;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("请投币：");
		int amount = in.nextInt();
		
		System.out.println(amount>=10);
		
		if(amount>10) {
			System.out.println("****************");
			System.out.println("Java城际铁路专线");
			System.out.println("  无指定座位票  ");
			System.out.println("   票价：10元  ");
			System.out.println("****************");
			System.out.println("找零："+(amount-10));
		}

	}

}
