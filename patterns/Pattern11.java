package patterns;
import java.util.*;
public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int l=n-1;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			

	}

}
