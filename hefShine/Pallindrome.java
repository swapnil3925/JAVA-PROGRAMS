package hefShine;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		int n, reverse = 0, temp, lastDigit;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		temp=n;
		while(temp>0)
		{
			lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit ;
			temp = temp / 10;
		}
		if(reverse == n)
		{
			System.out.println("Pallindrome...");
		}
		else
		{
			System.out.println("Not pallindrome...");
		}

	}

}
