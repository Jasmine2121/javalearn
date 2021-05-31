package demo08;

public class demo081 {
	public static void swap(int a, int b)
	{
	int t;
	t = a;
	a = b;
	b = t;
	}
	public static void main(String[] args) {
	int a = 5;
	int b = 6;
	swap(a,b);
	System.out.println(a+";"+b);
	}
}
