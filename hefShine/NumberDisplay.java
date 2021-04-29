package hefShine;

public class NumberDisplay {

	public static void main(String[] args) {
		
		boolean modthree = false;
		boolean modfive= false;
		int i;
		for(i=33 ; i<=999 ; i++)
		{
			modthree=(i%3==0 ? true : false);
			modfive=(i%5==0 ? true : false);
			
			if( !modthree && !modfive)
			{
				System.out.println(i);
			}
			else
			{
				if(modthree && modfive)
				{
					System.out.println("PINK AND YELLOW");
				}
				else if(modthree) 
				{
					System.out.println("PINK");
				}
				else if(modfive)
				{
					System.out.println("YELLOW");
				}
				
			}
			
			
		}
		int count =0;
		while(modthree)
		{
			count++;
			
		}
		System.out.println("COUNT IS:");
		System.out.println(count);
		

	}

}
