package hefShine;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year;
		System.out.println("Enter Year: ");
		year=sc.nextInt();
		
		if(year % 4 == 0)
		{
				if(year % 100 == 0)
				{
					if(year % 400 == 0)
					{
						System.out.println("Leap Year...");
					}
					else
					{
						System.out.println("Not Lear Year...");
					}
				}
				else
				{
					System.out.println("Leap Year...");
				}
		}
		else
		{
			System.out.println("Not Leap Year...");
		}
	}

}
