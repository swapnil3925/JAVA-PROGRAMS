package operators;

import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("ENTER FIRST NUMBER");
		a=sc.nextInt();
		System.out.println("EnTER SECOND NUMBER");
		b=sc.nextInt();
		
		int c=a+b;
		
		System.out.println(c);
		
		int d=++c;
		System.out.println("d="+d +""+ "c="+c );
	}

}
