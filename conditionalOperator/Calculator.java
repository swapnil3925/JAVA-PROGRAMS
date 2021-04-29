package conditionalOperator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int num1,num2,result=0;
		char operation;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		num1=sc.nextInt();
		
		System.out.println("Enter the second number ");
		num2=sc.nextInt();
		
		System.out.println("Enter the operation ");
		sc.nextLine();
		operation=sc.nextLine().charAt(0);
		
		switch(operation)
		{
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
			
		default:
			System.out.println("Invalid operation ");
		}
		
		System.out.println("Result is " +result);

	}

}
