package demo01;

import java.util.Scanner;

public class demo003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入整数：");
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		
		switch(type)
		{
		case 1:
		case 2:
			System.out.println("你好");
			break;
		case 3:
			System.out.println("晚上好");
		case 4:
			System.out.println("再见");
			break;
		default:
			System.out.println("啊？你说啥");
			break;
		}
	}

}
