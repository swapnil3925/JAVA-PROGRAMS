package hefShine;
import java.util.*;
public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	double sides,area;
	
	System.out.println("enter sides:");
	sides=sc.nextDouble();
	
	area = (1.73 * sides * sides) / 4 ;
	
	System.out.println("Area of Equilateral Triangle is :"+area);
	
	


	}

}
