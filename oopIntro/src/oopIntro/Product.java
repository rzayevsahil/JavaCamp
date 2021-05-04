package oopIntro;

public class Product {

	int id;
	String name;
	double unitPrice;
	String detail;

	public Product() { // constructor
		System.out.println("Ben çalýþtým");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();// boþ constructoru çaðýrýyor - 5.satýrdaki
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}
