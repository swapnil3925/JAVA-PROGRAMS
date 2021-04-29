package hefShine;
import java.util.*;
public class GradeOfStudents {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double sub1,sub2,sub3,sub4,sub5,total=0,percentage=0,outof=500;
			
			System.out.print("Enter First subject mark out of 100 : ");
			sub1=sc.nextDouble();
			
			System.out.print("Enter Second subject mark out of 100: ");
			sub2=sc.nextDouble();
			
			System.out.print("Enter Third subject mark out of 100 : ");
			sub3=sc.nextDouble();
			
			System.out.print("Enter Fourth subject mark out of 100: ");
			sub4=sc.nextDouble();
			
			System.out.print("Enter Fifth subject mark out of 100 : ");
			sub5=sc.nextDouble();
			
			System.out.println("-------------------------------------");
			
			total = sub1 + sub2 + sub3 + sub4 + sub5;
			percentage = (total/outof) * 100 ;
			
			System.out.println("total marks :"+total+"  outof :"+outof);
			System.out.println("percentage :"+percentage);
			
			if(percentage >= 90)
			{
				System.out.println("Grade A");
			}
			else if(percentage >= 80)
			{
				System.out.println("Grade B");
			}
			else if(percentage >= 70)
			{
				System.out.println("Grade C");
			}
			else if(percentage >= 60)
			{
				System.out.println("Grade D");
			}
			else if(percentage >= 40)
			{
				System.out.println("Grade E");
			}
			else
			{
				System.out.println("grade F");
			}

	}

}
