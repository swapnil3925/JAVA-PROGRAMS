package assignments;
import java.util.*;

public class NumberSeriesOne {

	public static void main(String[] args) {
	
		float n,result=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		n=sc.nextFloat();
		
		
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				result=result-1/i;
			}
			else
			{
				result=result+1/i;
			}
		}

		System.out.println(result);
	}

}
