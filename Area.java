public class Area
{
	int Calc(int l, int b)
	{
	int area;
	area = l * b;
	return (area);
	}

public static void main(String[] args)
{
	int ar1=0, ar2=0;
	Area obj1 = new Area();
	Area obj2 = new Area();
	ar1 = obj1.Calc(15,10);
	ar2 = obj2.Calc(25,15);
	System.out.println("Area of figure1 = " + ar1);
	System.out.println("Area of figure2 = " + ar2);
}
}
