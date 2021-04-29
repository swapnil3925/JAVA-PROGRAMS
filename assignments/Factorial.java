package assignments;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number for factorial");
		number=sc.nextInt();
		int factorial=1;
		
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Number is "+number+" Factorial is "+factorial);
		
	 
			

	}

}
