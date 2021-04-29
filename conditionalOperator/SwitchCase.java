package conditionalOperator;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
//		int noOfDay=3;
//		switch(noOfDay)
//		{
//		case 1:
//			System.out.println("its first day ");
//			break;
//		
//		case 2:
//			System.out.println("its second day ");
//			break;
//			
//		case 3:
//			System.out.println("its third day ");
//			break;
//			
//		default :
//			System.out.println("invalid day");
//		}
		

		int review;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the review between 1 to 5");
		review=sc.nextInt();
		
		switch(review) {
		
		case 1:
		case 2:
			System.out.println("Bad Review ");
			break;
			
		case 3:
			System.out.println("Average Review");
			break;
			
		case 4:
		case 5:
			System.out.println("Good Review");
			break;
			
		default :
			System.out.println("Invalid Review....");
		}
		
		
		
	}

}
