package hefShine;
import java.util.*;
public class CelsiusToFahreheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double celcius,fahrenheit;
		
		System.out.println("Enter celcius:");
		celcius=sc.nextDouble();
		
		fahrenheit  = 32 + ( 1.8 * celcius);

		System.out.println("Fahernheit :"+fahrenheit);
	}

}
