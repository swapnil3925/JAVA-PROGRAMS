package hefShine;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number...");
		
		int n=sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=i; j<=n ; j++)
			{
				System.out.print((char)(j+64));
			}
			for(int k=2 ; k<=i ; k++)
			{
				System.out.print("  ");
			}
			for(int l=n ; l>=i ; l--)
			{
				System.out.print((char)(l+64));
			}
			System.out.println();
			
			
		}
;
		

	}

}
