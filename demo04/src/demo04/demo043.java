package demo04;

public class demo043 {

	public static void main(String[] args) {
		int primes=50; //设置输出素数的个数
		int count = 0; //计数
		int n=2; //从2开始查找
		System.out.println("50个素数为：");
		while(count<primes)
		{
			boolean flag=true;
			for(int i=2; i<n-1;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				count++;
				if(count % 10 == 0)
				{
					System.out.println(n);
				}
				else
				{
					System.out.print(n + " ");
				}
			}
			n++;
		}
	}
}