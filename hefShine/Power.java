package hefShine;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		int number,power;
		double result = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NUmber");
		number=sc.nextInt();
		System.out.println("Enter Power");
		power=sc.nextInt();
		
		for(int i=0; i<power ;i++)
		{
			result = result * number;
		}
		System.out.println(result);
		

	}

}
