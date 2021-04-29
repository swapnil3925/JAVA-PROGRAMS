package loops;
import java.util.*;
public class DoWhileLoops {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=1;
		do{
			
			n=sc.nextInt();
			System.out.println("number is "+n);
			
		}while(n!=0);
		

	}

}
