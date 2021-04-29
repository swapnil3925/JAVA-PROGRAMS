package loops;
import java.util.*;
public class WhileLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int n =sc.nextInt();
//		int temp = n;
//		int sum=0;
//		
//		while(temp>0)
//		{
//			int lastDigit= temp % 10;
//			temp=temp / 10;
//			
//			sum = sum + lastDigit;
//		}
//		
//		System.out.println("Sum of digit of "+n +" is "+ sum);
		
		int numberOfDigit = (int)Math.log10(n)+1;
		System.out.println(numberOfDigit);
		
	}

}
