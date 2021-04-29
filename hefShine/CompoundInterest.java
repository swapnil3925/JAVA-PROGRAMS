package hefShine;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double amount,principal,rateOfInterest,n,time;
		System.out.println("enter principal");
		principal=sc.nextDouble();
		System.err.println("enter rate of interest");
		rateOfInterest=sc.nextDouble();
		//System.out.println("enter number of time intertest");
		//n=sc.nextDouble();
		System.out.println("enter time");
		time=sc.nextDouble();
		
		
		amount = principal * Math.pow(1 + rateOfInterest / 100, time);
		
		System.out.println(amount);
	}

}
