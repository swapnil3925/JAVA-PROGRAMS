package hefShine;
import java.util.*;
public class MaxMin2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1 > num2)
		{
			System.out.println("First NUmber is Max and Second Number is Min");
		}
		else if(num1 < num2)
		{
			System.out.println("Second Number is Max  and first number Min");
		}
		else
		{
			System.out.println("Both numbers are equal...");
		}

	}

}
