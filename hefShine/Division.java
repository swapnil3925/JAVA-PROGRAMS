 package hefShine;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float number1,number2,result;
		System.out.println("Enter the numbers");
		number1=sc.nextInt();
		number2=sc.nextInt();
		
		result=number1/number2;
		
		System.out.println(result);

	}

}