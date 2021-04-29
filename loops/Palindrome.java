package loops;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMMBE1");
		int n=sc.nextInt();
		int temp=n;
		int reversedNumber=0;
		
		while(temp>0)
		{
			int lastDigit = temp % 10;
			reversedNumber=reversedNumber * 10 +lastDigit;
			temp=temp/10;
		}
		if(reversedNumber==n)
		{
			System.out.println(n +" is palindrome");
		}
		else
		{
			System.out.println(n +" is not palindrome");
		}

	}

}
