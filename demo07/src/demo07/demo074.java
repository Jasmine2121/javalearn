package demo07;

import java.util.Scanner;

public class demo074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1="0123A563789ºº×Ó";
		int loc = s1.indexOf('3');
		System.out.println(s1.indexOf('4'));
//		System.out.println(s1.substring(2,4));
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.indexOf("A56"));
		System.out.println(s1.indexOf('3'));
		System.out.println(s1.indexOf('3',loc));
		System.out.println(s1.indexOf('3',loc+1));
	}

}
