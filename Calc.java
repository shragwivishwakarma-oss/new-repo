public class Calc
{
	void add(int a, int b)
	{
		int res;
		res = a + b;
		System.out.println(res);
	}
	void mul(int a, int b)
	{
		int res = a * b;
		System.out.println(res);
	}
	void div(int a, int b)
	{
		float res = a / b;
		System.out.println(res);
	}


public static void main(String[] args)
	{
		Calc obj = new Calc();
		int i=5, j=10;
		obj.add(i, j);
		obj.mul(i, j);
		obj.div(i, j);
	}
}