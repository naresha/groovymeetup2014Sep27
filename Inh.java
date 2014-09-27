class Parent{
	public void doIt(double number){
		System.out.println(number + " Double parent");
	}
}

class Child extends Parent{
	public void doIt(int number){
		System.out.println(number + " Integer Child");
	}
	
	public void doIt(double number){
		System.out.println(number + " Double child");
	}
}

public class Inh{
	public static void main( String[] args ) {
		Parent p = new Parent();
		Parent c = new Child();
		p.doIt(10);
		c.doIt(10);
	}
}
