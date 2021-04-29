package hefShine;

import java.util.Scanner;
public class PellNumber  {

    public static void main(String args[])
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter number: ");
	int n,a=1,b=0,c;
	n=sc.nextInt();
	
    System.out.println("Pell numbers: ");
    for(int i=1; i<=n; i++)
     {
      c= 2 * b + a;
      System.out.print(c+" ");
      a = b;
      b = c;
     }
   }
 }
