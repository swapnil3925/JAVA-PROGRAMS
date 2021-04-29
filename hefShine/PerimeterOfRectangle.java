package hefShine;
import java.util.*;
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double length,width,perimeter;
		System.out.println("Enter length:");
		length=sc.nextDouble();
		
		System.out.println("Enter width:");
		width=sc.nextDouble();
		
		perimeter = 2 * (length + width);
		
		System.out.println("Perimeter Of Rectangle is:"+perimeter);

	}

}
