package hefShine;
import java.util.*;
public class SumOfDgit {

	public static void main(String[] args) {
		int number,sum=0,lastDigit,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		number=sc.nextInt();
		
		temp=number;
		while(temp>0)
		{
			lastDigit = temp % 10;
			temp = temp / 10;
			sum = sum + lastDigit;
		}
		System.out.println("Sumber of Digit is:"+sum);

	}

}
