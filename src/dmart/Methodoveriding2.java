package dmart;

public class Methodoveriding2 extends Method_overriding_1{
	@Override
	public void employeename() {
		System.out.println("rajesh");
		super.employeename();
	}
	@Override
	public void date_of_birth() {
		System.out.println("1998");
		super.date_of_birth();
	}
	public static void main(String[] args) {
		Methodoveriding2 G= new Methodoveriding2();
	G.employeename();
	G.date_of_birth();
	}
}



