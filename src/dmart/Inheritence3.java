package dmart;

public class Inheritence3 extends Inheritence2{
private void mobilebanking() {
	System.out.println("ssr");
}
private void creditcard() {
	System.out.println("yes");

}
public static void main(String[] args) {
	Inheritence3 G=new Inheritence3();
	G.account_holder();
	G.atmpin();
	G.bankname();
	G.internet();
	G.mobilebanking();
	G.creditcard();
}
}