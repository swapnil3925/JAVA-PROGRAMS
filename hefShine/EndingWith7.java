package hefShine;


public class EndingWith7 {

	public static void main(String[] args) {
		
		for(int i=100;i<200;i++)
		{
				int lastDigit = i % 10;
				if(lastDigit == 7)
				{
				System.out.println(i);		
				}
		}

	}

}
