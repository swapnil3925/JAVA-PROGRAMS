package hefShine;
import java.util.*;

public class AreaOfCircle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double redius,area;
	double pi=3.142;
	
	System.out.println("enter redius of circle");
	redius=sc.nextDouble();
	
	area = pi * redius * redius;
	
	System.out.println("Area of circle is:"+area);
	}

}
