package demo06;

import java.util.Scanner;

public class demo064 {

	public static void main(String[] args) {
		//二维数组
		Scanner in = new Scanner(System.in);
	//来个常量
		final int SIZE =3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		//读入矩阵
		for(int i=0; i<SIZE; i++)
		{
			for(int j=0; j<SIZE; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		//检查行
		for(int i=0; i<SIZE; i++)
		{
			numOfX=0;
			numOfO=0;
			for(int j=0; i<SIZE; i++)
			{
				if(board[i][j]==1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}
			}
			if(numOfX==SIZE||numOfO==SIZE)
			{
				gotResult=true;
				break;
			}
		}
		//检查列
		if(!gotResult)
		{
			for(int i=0; i<SIZE; i++)
			{
				numOfX=0;
				numOfO=0;
				for(int j=0; i<SIZE; i++)
				{
					if(board[i][j]==1)
					{
						numOfX++;
					}
					else
					{
						numOfO++;
					}
				}
				if(numOfX==SIZE||numOfO==SIZE)
				{
					gotResult=true;
					break;
				}
			}
		}
		//检查对角线
		if ( !gotResult )
		{
			numOfX = 0;
			numOfO = 0;
			for ( int i=0; i<SIZE; i++ )
			{
				if ( board[i][i] == 1 )
				{
					numOfX ++;
				}
				else
				{
					numOfO ++;
				}
			}
			if ( numOfX == SIZE || numOfO == SIZE )
			{
				gotResult = true;
			}
		}
		//检查反对角线
		if ( !gotResult )
		{
			numOfX = 0;
			numOfO = 0;
			for ( int i=0; i<SIZE; i++ )
			{
				if ( board[i][SIZE-i-1] == 1 )
				{
					numOfX ++;
				}
				else
				{
					numOfO ++;
				}
			}
			if ( numOfX == SIZE || numOfO == SIZE )
			{
				gotResult = true;
			}
		}
		//输出结果
		if ( gotResult )
			{
			if ( numOfX == SIZE )
			{
				System.out.println("X WIN");
			}
			else
			{
				System.out.println("O WIN");
			}
		}
	}

}
