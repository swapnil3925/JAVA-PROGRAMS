package hefShine;
import java.util.*;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double income,expense;
		
		System.out.print("Enter Income: ");
		income=sc.nextDouble();
		
		System.out.print("Enter Expense: ");
		expense=sc.nextDouble();
		
		double check=income-expense;
		
		
		if(income > expense)
		{
			System.out.println("Profit  by "+check);
		}
		else if(income < expense)
		{
			System.out.println("Loss by "+check);
		}
		else
		{
			System.out.println("No Profit No loss");
		}

	}

}
