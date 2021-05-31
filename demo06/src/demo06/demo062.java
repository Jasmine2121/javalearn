package demo06;

import java.util.Scanner;

public class demo062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] data = {3,2,5,7,4,9,11,34,12,28};
		int x = in.nextInt();
		int loc = -1;//表示没找到
		boolean found= false;
		for(int i=0; i<data.length; i++)
		{
			if(x == data[i])
			{
				loc = i;
				break;
			}
		}
		for(int k:data)
		{
			if(k==x)//但是不知道是第几个
			{
				found=true;
				break;//找到就跳出来
			}
		}
		if(loc>-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println(x+"不在里面");
		}
	}

}
