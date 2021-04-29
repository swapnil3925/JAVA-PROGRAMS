package hefShine;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principal,rate,time,simpleInterest;
	
		System.out.println("Enter principal");
			principal=sc.nextDouble();
		System.out.println("Enter rate");
			rate=sc.nextDouble();
		System.out.println("Enter time");
			time=sc.nextDouble();
	
	
	simpleInterest=(principal * rate * time)/100;
	double total=simpleInterest  + principal;
	
	System.out.println(simpleInterest);
	System.out.println(total);
	}

}
