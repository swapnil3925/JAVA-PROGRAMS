package hefShine;
import java.util.*; 

public class Calculator {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 double number1,number2,result=0;
		 int choice;
	do {
		 System.out.print("Enter First Number");
		 number1=sc.nextDouble();
		 System.out.print("Enter Second Number");
		 number2=sc.nextDouble();
		 
		 System.out.print("1.Addition\n2.Substraction\n3.multiplication\n4.division\n5.modulus\n0.exit");
		 choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 result=number1+number2;
			 System.out.println(result);
			 break;
			 
		 case 2:
			 result=number1 - number2;
			 System.out.println(result);
			 break;
			 
		 case 3:
			 result=number1 * number2;
			 System.out.println(result);
			 break;
			 
		 case 4:
			 result=number1 / number2;
			 System.out.println(result);
			 break;
			 
		 case 5:
			 result=number1 % number2;
			 System.out.println(result);
			 break;
			 
		 case 0:
		 System.out.println("THANK YOU VISIT AGAIN....");
		 break;
		 
			 default:
				System.out.println("INVALID CHOICE..."); 
		
		 
		 }
     }while(choice != 0);
	}
	

}
