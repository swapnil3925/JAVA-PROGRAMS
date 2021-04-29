package conditionalOperator;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=30,b=22,c=15;
		int result=0;
		
		if(a > b)
		{
			if(a > c)
			{
				result=a;
			}
			else
			{
				result=c;
			}
		}
		else
		{
			if(b>c)
			{
				result=b;
			}
			else
			{
				result=c;
			}
		}
		System.out.println("Greater number is "+result);
		

	}

}
