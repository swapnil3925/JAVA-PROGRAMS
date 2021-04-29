package hefShine;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
			int number=sc.nextInt();
			
			if(number % 2 == 0)
			{
				System.out.println("number is even...");
			}
			else
			{
				System.out.println("number is Odd...");
			}
	}

}
