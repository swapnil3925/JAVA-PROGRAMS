package hefShine;
import java.util.*;

public class Ovels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char c;
		System.out.println("Enter any Charachter");
		c=sc.next().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		{
			System.out.println("CHARACHER IS OVEL...");
		}
		else
		{
			System.out.println("CHARACTER IS CONCONANT...");
		}

	}

}
