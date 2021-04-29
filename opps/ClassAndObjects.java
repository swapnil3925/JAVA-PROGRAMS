package opps;

class Cat{
	int leg,eyes;
	String name;
	
	public void eat()
	{
		System.out.println(name+" is eating");
	}
	public void discription()
	{
		System.out.println(name+" have "+leg+" legs and"+eyes+" eyes");
	}
}
class Dog
{
	String name,breed;
	
	public void jump()
	{
		System.out.println(name+" is jumping");
	}
	public void decription()
	{
		System.out.println(name+" is "+breed);
	}
}
public class ClassAndObjects {

	public static void main(String[] args) {
//		Cat cat1=new Cat();
//		cat1.leg=4;
//		cat1.eyes=2;
//		cat1.name="MANJAR";
//		cat1.eat();
//		cat1.discription();
		
		Dog dog1=new Dog();
		dog1.name="Tommy";
		dog1.breed="German Sheford";
		dog1.jump();
		dog1.decription();
	}

}
