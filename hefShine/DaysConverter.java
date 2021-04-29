package hefShine;

import java.util.Scanner;

public class DaysConverter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int days,years,weeks;
		
		System.out.print("enter days :");
		days=sc.nextInt();
		
		years=days / 365;
		weeks=(days % 365) / 7;
		days=(days % 365) % 7;
		
		System.out.println("years:"+years+" "+"weeks:"+weeks+" "+"days:"+days+" ");
	}

}
