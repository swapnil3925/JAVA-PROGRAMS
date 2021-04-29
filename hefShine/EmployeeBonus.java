package hefShine;

import java.util.*;

class Bonus {

	public void calculation(int service, int salary) {
		int bonus, totalSalary;
		if (service > 5) {
			bonus = salary * 35 / 100;
			totalSalary = bonus + salary;
			System.out.println("Employee Salary with bonus is:" + totalSalary);
		} else {
			bonus = salary * 15 / 100;
			totalSalary = bonus + salary;
			System.out.println("Employee Salary with bonus is:" + totalSalary);
		}
	}
	// void disp(String name,int service,int salary)
	// {
	// System.out.println(name);
	// System.out.println(salary);
	// System.out.println(service);
	//
	// System.out.println(bonus);
	// }

}

public class EmployeeBonus {

	public static void main(String[] args)

	{
		String name = null;
		int employeeSalary = 0, yearOfService = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		name = sc.next();

		System.out.println("Enter Employee Salary: ");
		employeeSalary = sc.nextInt();
		System.out.println("Enter Year Of services");
		yearOfService = sc.nextInt();
		Bonus b = new Bonus();
		b.calculation(yearOfService, employeeSalary);
		
	}

	
}
