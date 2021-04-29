package hefShine;
import java.util.*;

public class ElectricityCharge {

	public static void main(String[] args) {
		double units,bill=0,totalBill,extra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Units:");
		units=sc.nextDouble();
		
		if(units >= 1 && units <=50)
		{
			bill= units * 0.50;
			System.out.println("your bill is:              "+bill+" Rs.");
			extra= (bill * 20) / 100;
			System.out.println("Additional Charges 20%:    "+extra+"  Rs.");
			System.out.println("________________________________________________");
			totalBill=extra + bill ;
			System.out.println("total Bill:                "+totalBill+" Rs.");
		}
		else if(units >=51 && units <= 150)
		{
			bill= units * 0.75;
			System.out.println("your bill is:              "+bill+" Rs.");
			extra= (bill * 20) / 100;
			System.out.println("Additional Charges 20%:    "+extra+"  Rs.");
			System.out.println("________________________________________________");
			totalBill=extra + bill ;
			System.out.println("total Bill:                "+totalBill+" Rs.");
			
		}
		else if(units >=151 && units <=250)
		{
			bill= units * 1.20;
			System.out.println("your bill is:              "+bill+" Rs.");
			extra= (bill * 20) / 100;
			System.out.println("Additional Charges 20%:    "+extra+"  Rs.");
			System.out.println("________________________________________________");
			totalBill=extra + bill ;
			System.out.println("total Bill:                "+totalBill+" Rs.");
		}
		else
		{
			bill= units * 1.50;
			System.out.println("your bill is:              "+bill+" Rs.");
			extra= (bill * 20) / 100;
			System.out.println("Additional Charges 20%:    "+extra+"  Rs.");
			System.out.println("________________________________________________");
			totalBill=extra + bill ;
			System.out.println("total Bill:                "+totalBill+" Rs.");
			
		}

	}

}
