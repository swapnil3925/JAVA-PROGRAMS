package hefShine;
import java.util.*;
public class PerimeterOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double redius,pi=3.142,perimeter;
		
		System.out.println("Enter Redius of Circle");
		redius=sc.nextDouble();
		
		perimeter = 2 * (pi * redius);
		
		System.out.println("Perimeter of Circle is:"+perimeter);
	}

}
