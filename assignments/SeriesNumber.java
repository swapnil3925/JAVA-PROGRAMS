package assignments;
import java.util.*;

public class SeriesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		float result=0;
		for(float i=1; i<=number; i++)
		{
			result=result+1/i;
		}
		System.out.println(result);
	}

}
