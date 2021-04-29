package hefShine;
class Data
{
	String name="Swapnil";
	String address="Ashta";
	int id=121;
	
 void disp()
 {
	System.out.println(name);
	System.out.println(address);
	System.out.println(id);
 }
}
public class ClassIntro {

	public static void main(String[] args) {
		Data d1=new Data();
		System.out.println(d1.address);
		d1.disp();

	}

}
