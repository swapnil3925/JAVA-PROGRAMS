package hefShine;
import java.util.*;
public class NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,count=0;
		System.out.println("Enter number...");
		number=sc.nextInt();
		
		while(number != 0)
		{
			number=number/10;
			count++;
		}
		System.out.println("Number of digit :"+count);

	}

}
