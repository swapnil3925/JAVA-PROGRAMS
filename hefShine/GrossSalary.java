package hefShine;
import java.util.*;

public class GrossSalary {

	public static void main(String[] args) {
		double baseSalary,grossSalary;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Base Salary:");
		baseSalary=sc.nextDouble();
		
		if(baseSalary <= 10000)
		{		
			double hra=(20*baseSalary)/100;
			double da=(80*baseSalary)/100;
			grossSalary=baseSalary + hra + da;
			System.out.println("hra:"+hra+" "+"da:"+da);
			System.out.println("GrossSalary:"+grossSalary);
		}
		else if(baseSalary > 10000 && baseSalary <= 20000 )
		{
			double hra=(25*baseSalary)/100;
			double da=(90*baseSalary)/100;
			grossSalary=baseSalary + hra + da;
			System.out.println("hra:"+hra+" "+"da:"+da);
			System.out.println("GrossSalary:"+grossSalary);
		}
		else if(baseSalary>20000)
		{
			double hra=(30*baseSalary)/100;
			double da=(95*baseSalary)/100;
			grossSalary=baseSalary + hra + da;
			System.out.println("hra:"+hra+" "+"da:"+da);
			System.out.println("GrossSalary:"+grossSalary);
		}
		
	}

}
