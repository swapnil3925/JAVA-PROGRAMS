package hefShine;
import java.util.*;
public class AverageOfMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter number subjects");
		n=sc.nextInt();
		float marks[]=new float[n];
		
			for(int i=0 ; i < n ; i++ )
			{
				marks[i]=sc.nextInt();
			}
			
			float averageMarks=0;
			
			for(int i=0 ; i < n ; i++)
			{
				averageMarks=averageMarks + marks[i];
			}
			System.out.println("total:"+averageMarks);
			averageMarks/=n;
			
			System.out.println("average:"+ averageMarks);
			
		}
	}


