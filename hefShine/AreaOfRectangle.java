package hefShine;
import java.util.*;

public class AreaOfRectangle {

	public static void main(String[] args) {
		double width,length,area;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the width:");
		width=sc.nextDouble();
		
		System.out.println("Enter the length:");
		length=sc.nextDouble();
		
		area = width * length ;
		
		System.out.println("Area of rectangle:"+area);

	}

}
