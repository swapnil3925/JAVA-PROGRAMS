package methods;

public class IntroMethods {

	public static void main(String[] args) {
	int firstNumber=12;
	int lastNumber=34;
	int result=maxOf(firstNumber, lastNumber);
		System.out.println(result);
	}
	
	
	static int maxOf(int a, int b)
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

}
