package hefShine;

import java.util.Scanner;

class EmpDemo
{
		
		
		public void doPublic()
		{
			
		}
		void doDefault()
		{
			
			
		}
		protected void doProtected()
		{
			
		}
		private void doPrivate()
		{
			
			
		}
}

public class EmployeeDemo 
	{
	public static void main(String[] args) {
		
		protected int empId;
		public String empName;
		private double empSalary;
		String empDept;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empId:");
		empId=sc.nextInt();
		
		System.out.println("Enter empname:");
		empName=sc.next();
		
		System.out.println("Enter empSalary:");
		empSalary=sc.nextDouble();
		
		System.out.println("Enter empDept:");
		empDept=sc.next();
	}

}
