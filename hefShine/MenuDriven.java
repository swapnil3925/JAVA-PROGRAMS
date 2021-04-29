package hefShine;
import java.util.*;
public class MenuDriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int number,ch;
//		System.out.println("Enter number...");
//		number=sc.nextInt();
		
	int ch;
	do {	
		System.out.println("\nEnter Choice...\n1.Prime\n2.Odd\n3.Even\n0.Exit");
		 ch=sc.nextInt();
		
		switch(ch)
		{
			case 1 :
				for (int i = 1; i < 100; i++) {
	            if(isPrimeNumber(i))
	            	{
	                System.out.print(" "+i);
	            	}
				}
				break;
				
			case 2:
				for(int i=1;i<=100;i++)
				{
					if(i%2 != 0)
					{
						System.out.print(" "+i);
					}
				}
				break;
				
			case 3:
				for(int i=1;i<=100;i++)
				{
					if(i%2==0)
					{
						System.out.print(" "+i);
					}
				}
				break;
				
				 
		}
	}while(ch!=0);
		
		
		

	}
	public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
 }

}
