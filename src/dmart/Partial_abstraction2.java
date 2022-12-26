package dmart;

public class Partial_abstraction2 extends Partial_Abstraction1{

	@Override
	void fever() {
		System.out.println("Curable");
		
	}

	@Override
	void malaria() {
		System.out.println("Fine");
		
	}

	@Override
	void dengu() {
		System.out.println("super Curable");
		
	}
	public static void main(String[] args) {
		Partial_abstraction2 G=new Partial_abstraction2();
		G.fever();
		G.dengu();
		G.malaria();



}
}
