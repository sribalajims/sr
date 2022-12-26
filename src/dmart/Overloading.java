package dmart;

public class Overloading {
private void employee(int age) {
	System.out.println(age);

}
private void employee(float name) {
	System.out.println(name);

}
private void employee(String tamil) {
	System.out.println(tamil);

}
public static void main(String[] args) {
	Overloading G=new Overloading();
	G.employee(2121313);
	G.employee(26);
	G.employee("MADHAN");
}
}
