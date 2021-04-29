package assignments;
import java.util.*;
public class Power {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,result=1;
	System.out.println("enter number ");
	a=sc.nextInt();
	System.out.println("enter power ");
	b=sc.nextInt();
	
	for(int i=0;i<b;i++)
	{
		result=result*a;
	}
	System.out.println(result);

	}

}
