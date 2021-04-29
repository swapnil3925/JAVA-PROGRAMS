package opps.encapsulation;

public class EncapsulationIntro {
	public static void main(String args[])
	{
			Student obj =new Student();
//			obj.name ="Swapnil";
//			obj.age = 23;
			obj.setAge(35);	
			System.out.println("age: "+obj.getAge());
	}

}
