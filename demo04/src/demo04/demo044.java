package demo04;

import java.util.Scanner;

public class demo044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		OUT://标号
		for(int one =0; one<=amount; ++one)
		{
			for(int five=0; five<=amount; ++five)
			{
				for(int ten=0; ten<=amount; ++ten)
				{
					for(int twenty=0; twenty<=amount; ++twenty)
					{
						if(one+five*5+ten*10+twenty*20==amount)
						{
							System.out.println(one+"张1元,"+five+"张5元,"+ten+"张10元,"+twenty+"张20元");
							break OUT;
						}
					}
				}
			}
			
		}
	}

}
