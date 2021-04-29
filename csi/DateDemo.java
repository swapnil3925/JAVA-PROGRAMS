package csi;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {
	public static void main(String[] args) {
		Date date=new Date();
//		System.out.println(date.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("dd.mm.yyyy");
		System.out.println("date : "+ sdf.format(date));
		
	}
}
