package hefShine;
import java.util.*;
public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three Numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Maximum");
			}
			else
			{
				System.out.println("C is Maximum");
			}
		}
		else if(b>a)
		{
			if(b>c)
			{
				System.out.println("B is Maximum");
			}
			else
			{
				System.out.println("c is maximum");
			}
		}
	

	}

}
