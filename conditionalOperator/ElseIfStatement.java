package conditionalOperator;

public class ElseIfStatement {

	public static void main(String[] args) {
		int number=101;
		
		if(number < 10)
		{
			System.out.println("Number is less than 10");
		}
		else if(number == 10)
		{
			System.out.println("number is eqaul to 10");
		}
		else if(number >= 11 && number <= 20)
		{
			System.out.println("number is greater than and less than 20");
		}
		else if(number >=21 && number <= 30)
		{
			System.out.println("number is greater than 21 and less than 30");
		}
		else
		{
			System.out.println("number is greater than 30");
		}

		
	}

}
