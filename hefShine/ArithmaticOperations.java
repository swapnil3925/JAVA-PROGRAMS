package hefShine;
import java.util.*;

public class ArithmaticOperations {

	public static void main(String[] args) {
	
		float number1,number2,result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");

		number1=sc.nextFloat();
		number2=sc.nextFloat();
		
		
		result= number1 + number2;
		System.out.println(result);
		
		result= number1 - number2;
		System.out.println(result);
		
		result= number1 * number2;
		System.out.println(result);
		
		result= number1 / number2;
		System.out.println(result);
		
		result= number1 % number2;
		System.out.println(result);
	}

}
