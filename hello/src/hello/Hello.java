package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		foot = (int)(30/3.0);
		double inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		System.out.println(foot);
		inch = in.nextInt();
		System.out.println(inch);
		System.out.println((int)((foot+inch/12)*0.3048*100));
	}

}
