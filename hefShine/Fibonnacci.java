package hefShine;
import java.util.*;
public class Fibonnacci {

	public static void main(String[] args) {
		int a=0,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		System.out.print(a+" "+b+" ");
		//System.out.print(b);
		for(int i=0; i<n-2 ;i++)
		{
			c=a + b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
			
		}
	}

}
