package scannerClass;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int x=sc.nextInt();
//		double y=sc.nextDouble();
//		char z=sc.next().charAt(0);
//		String str=sc.nextLine();
//		
//		System.out.println("int value"+x);
//		System.out.println("double value"+y);
//		System.out.println("char value"+z);
//		System.out.println("string value-"+str);
		
		Scanner sc=new Scanner(System.in);
		int principal,time;
		float rate;
		double simpleInterest,total;
		
		System.out.println("ENTER THE PRINCIPAL AMOUNT:");
		principal=sc.nextInt();
		System.out.println("ENTER THE RATE AMOUNT:");
		rate=sc.nextFloat();
		System.out.println("ENTER THE TIME AMOUNT:");
		time=sc.nextInt();
		
		simpleInterest=principal * rate * time /100;
		total=principal+simpleInterest;
		
		System.out.println("SIMPLE INTEREST="+ simpleInterest);
		System.out.println("TOTAL AMOUNT="+total);
		
		
		

	}

}
