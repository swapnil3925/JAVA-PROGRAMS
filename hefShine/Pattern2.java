package hefShine;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER...");
		//int j;
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++)
		{
			for(int j=i;j<n+1;j++)
			{
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		}
		
		
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	

	}

}
