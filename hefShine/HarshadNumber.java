package hefShine;
import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		int number,n,rem=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number>>");
		number=sc.nextInt();
		
		n=number;
		while(n>0)
		{
			rem = n % 10;
			sum = sum  + rem;
			n = n / 10;
		}
		if(number%sum==0)
		{
			System.out.println("harshad Number...");
		}
		else
		{
			System.out.println("Not Harshad Number...");
		}
	}

}
