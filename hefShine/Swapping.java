package hefShine;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
			int num1,num2,temp;
			Scanner sc=new Scanner(System.in);
			System.out.print("num1=");
			num1=sc.nextInt();
			System.out.print("num2=");
			num2=sc.nextInt();
//			
//			temp=num1;
//			num1=num2;
//			num2=temp;
//			
//			System.out.println("a="+num1+" "+"b="+num2);
			num1+=num2;
			num2=num1-num2;
			num1-=num2;
			System.out.println("num1="+num1+" "+"num2="+num2);
	}

}
