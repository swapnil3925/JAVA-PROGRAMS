package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1,str2;

		System.out.println("Enter first String ");
		str1=sc.next();
		
		System.out.println("Enter second String ");
		str2=sc.next();
		
		boolean isAnagram=true;
		if(str1.length()!=str2.length())
			{
				isAnagram=false;
			}
		else
			{
				char[] arr1=str1.toLowerCase().toCharArray();
				char[] arr2=str2.toLowerCase().toCharArray();
				
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				
				 isAnagram= Arrays.equals(arr1, arr2);
				
			}
		if(isAnagram) {
			System.out.println("is Anagram");
		}
		else
		{
			System.out.println("is Not Anagram");
		}
		
		
	}

}
