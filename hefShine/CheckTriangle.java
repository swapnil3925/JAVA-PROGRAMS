package hefShine;
import java.util.*;

public class CheckTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float side1,side2,side3;
		System.out.print("Enter first Side:");
		side1=sc.nextFloat();
		
		System.out.print("Enter second Side:");
		side2=sc.nextFloat();
		
		System.out.print("Enter third Side:");
		side3=sc.nextFloat();
		
		if(side1 == side2 && side2 == side3 && side3 == side1)
		{
			System.out.println("EQUILATERAL TRIANGLE");
		}
		else if(side1 == side2 || side2 ==  side3 || side3 == side1)
		{
			System.out.println("ISOSCALES TRiANGLE");
		}
		else
		{
			System.out.println("SCALENE TRIANGLE");
		}

	}

}
