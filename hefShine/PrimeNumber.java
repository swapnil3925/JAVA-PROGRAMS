package hefShine;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean isprime=true;
		for(int i=2 ; i*i<=n ; i++)
		{
			if(n%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(n<2)
		{
			isprime=false;
		
		}
		System.out.println("isprime"+isprime);

	}

}
