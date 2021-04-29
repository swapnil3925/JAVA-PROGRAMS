package methods;

public class MethodOverLoading {

	public static void main(String[] args) {
		int firstNumber=10;
		int secondNumber=20;
		int result=maxOf(firstNumber,secondNumber);
		System.out.println(result);
		float number=10;
		maxOf(10);
	}
	static int maxOf(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	static void maxOf(float a)
	{
		System.out.println(a);
	}

}
