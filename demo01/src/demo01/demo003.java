package demo01;

import java.util.Scanner;

public class demo003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������");
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		
		switch(type)
		{
		case 1:
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("���Ϻ�");
		case 4:
			System.out.println("�ټ�");
			break;
		default:
			System.out.println("������˵ɶ");
			break;
		}
	}

}
