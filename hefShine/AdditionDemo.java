package hefShine;
class Arth
{
	
	static int add(int num1,int num2)
	{
		int result=num1 + num2;
		return result;
	}
	void sub(int num1,int num2)
	{
		int result=num1 - num2;
		System.out.println(result);
	}
	static int mult(int num1,int num2)
	{
		int result=num1 * num2;
		return result;
	}
	int div(int num1,int num2)
	{
	int	result=num1 / num2;
		return result;
	}
}
class AdditionDemo {
	public static void main(String[] args) {
		int number1=10,number2=20;
		Arth a=new Arth();
		System.out.println(Arth.add(number1,number2));
		a.sub(number1,number2);
		System.out.println(Arth.mult(number1,number2));
		System.out.println(a.div(number1,number2));
	}


}

