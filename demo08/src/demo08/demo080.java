package demo08;

public class demo080 {
	public static void sum(int a, int b) {
		int i;
		int sum;
		sum=0;
		for ( i=a; i<=b; i++ )
		{
		sum += i;
		}
		System.out.println(a+"��"+b+"�ĺ���"+sum);
	}
	public static void main(String[] args) {
		//���븴�Ʋ��á�������
		sum(1,10);
		sum(20,30);
		sum(35,45);
	}

}
