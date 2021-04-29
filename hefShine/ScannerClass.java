package hefShine;
import java.util.Scanner;

//import com.sun.org.apache.bcel.internal.generic.DLOAD;
public class ScannerClass {

	public static void main(String[] args) {
		int integerValue;
		float floatValue;
		double doublevalue;
		char charValue;
		short shortValue;
		long longValue;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter values:");
		
		integerValue =scanner.nextInt();
		System.out.println("integer:"+integerValue);
		
		floatValue =scanner.nextFloat();
		System.out.println("integer:"+floatValue);
		
		doublevalue =scanner.nextDouble();
		System.out.println("integer:"+doublevalue);
		
		charValue =scanner.next().charAt(0);
		System.out.println("integer:"+charValue);
		
		shortValue =scanner.nextShort();
		System.out.println("integer:"+shortValue);
		
		longValue =scanner.nextLong();
		System.out.println("integer:"+longValue);

	}

}
