package demo04;

import java.util.Scanner;

public class demo045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		boolean isPrime=true;
			for(int i=2; i<n1 ; i++)
			{
				if(n1%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(n1+"是素数");
			}
			else
			{
				System.out.println(n1+"不是素数");
			}
		}

}
