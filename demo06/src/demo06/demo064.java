package demo06;

import java.util.Scanner;

public class demo064 {

	public static void main(String[] args) {
		//��ά����
		Scanner in = new Scanner(System.in);
	//��������
		final int SIZE =3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		//�������
		for(int i=0; i<SIZE; i++)
		{
			for(int j=0; j<SIZE; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		//�����
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
		//�����
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
		//���Խ���
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
		//��鷴�Խ���
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
		//������
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
