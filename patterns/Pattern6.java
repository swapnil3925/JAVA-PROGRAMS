package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the Number");
//	int n=sc.nextInt();
	
//	for(int i=1;i<=n;i++) 
//	{
//		for(int j=1;j<=n-i+1;j++)
//		{
//			System.out.print("  ");
//		}
//		for(int k=1;k<=i-1;k++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//
//	}
	
	for(int i=1;i<=5;i++) 
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
