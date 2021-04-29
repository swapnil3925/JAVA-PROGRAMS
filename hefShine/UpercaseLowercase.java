package hefShine;
import java.util.*;
public class UpercaseLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char c;
		System.out.println("Enter Charachter:");
		c=sc.next().charAt(0);
		
		if(c >= 65 && c <= 90)
		{
			System.out.println("Character is Uppercase...");
		}
		else if(c >= 97 && c <=122)
		{
			System.out.println("Character is Lowercase...");
		}

	}

}
