package hefShine;
import java.util.*;

public class FahernheitToCelcius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double fahernheit,celcius;
		
		System.out.println("Enter fahernheit:");
		fahernheit=sc.nextDouble();
		
		celcius = (fahernheit - 32) * 0.5556;
		
		System.out.println("celcius:"+celcius);
	

	}

}
