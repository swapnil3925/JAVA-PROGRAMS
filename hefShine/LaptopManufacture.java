package hefShine;
import java.util.*;

public class LaptopManufacture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		double number1,number2,result;
		int choice = 0;
		
		System.out.println("UNLOCK YOUR PC (Y)");
		System.out.println("LOCK YOUR PC (N)");
	char ch= sc.nextLine().charAt(0);
	do {	
	if(ch=='Y')
		
	{
		System.out.println("WELCOME");
			do {
				System.out.println("1. ADDITON\n2. SUBSTARCTION\n3. MULTIPLICATION\n4. QUIT");
				choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					
					System.out.println("ENTER TWO NUMBERS:");
					number1=sc.nextDouble();
					number2=sc.nextDouble();
					result = number1 + number2;
					System.out.println("This is Result: "+result);
					break;
					
				case 2:
					System.out.println("ENTER TWO NUMBERS:");
					number1=sc.nextDouble();
					number2=sc.nextDouble();
					result = number1 - number2;
					System.out.println("This is Result: "+result);
					break;
					
				case 3:
					System.out.println("ENTER TWO NUMBERS:");
					number1=sc.nextDouble();
					number2=sc.nextDouble();
					result = number1 * number2;
					System.out.println("This is Result: "+result);
					break;
					
				case 4:
					System.out.println("QUITING....");
					break;
					
				default:
					System.out.println("INVALD CHOICE");
					break;
					
					
				}
			}while(choice!= 4);
		}
	else if(ch=='N')
	{
		System.out.println("Closing Windows....\n THANK YOU\n**********************");
		System.exit(1);
	}
	else
	{
		System.out.println("INVALID OPTION...");
	}
}while(ch != 'Y' && ch !='N');
		sc.close();
	}

}
