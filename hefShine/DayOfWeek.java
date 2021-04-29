package hefShine;
import java.util.*;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int choice = 0;
		
		System.out.println("1.monday\n2.tuesday\n3.wednesday\n4.thursday\n5.friday\n6.saturday\n7.sunday");
	choice=sc.nextInt();
		if(choice==1) System.out.println("ITS MONDAY");
		else if(choice==2) System.out.println("its tuesday");
		else if(choice==3) System.out.println("its wednesday");
		else if(choice==4) System.out.println("its thurday");
		else if(choice==5) System.out.println("its friday");
		else if(choice==6) System.out.println("its saturday");
		else if(choice==7) System.out.println("its sunday");
		else System.out.println("invalid choice");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		do {
//		System.out.println("Enter ur choice:");
//		System.out.println("1.monday\n2.tuesday\n3.wednesday\n4.thursday\n5.friday\n6.saturday\n7.sunday\n0.exit");
//		choice=sc.nextInt();
//		
//		switch(choice)
//		{
//		case 1:
//				System.out.println("ITS MONDAY");
//				break;
//				
//		case 2:
//			System.out.println("ITS TUESDAY");
//			break;
//			
//		case 3:
//			System.out.println("ITS WEDNESDAY");
//			break;
//			
//		case 4:
//			System.out.println("ITS THURSDAY");
//			break;
//			
//		case 5:
//			System.out.println("ITS FRIDAY");
//			break;
//			
//		case 6:
//			System.out.println("ITS SATURDAY");
//			break;
//			
//		case 7:
//			System.out.println("ITS SUNDAY");
//			break;
//			
//		case 0:
//			System.out.println("Exit");
//			break;
//			
//		default :
//				System.out.println("INVALID CHOICE");
//				break;
//			
//		}
//		}while(choice != 0);
		
	}

}
