package oopIntro;

public class Product {

	int id;
	String name;
	double unitPrice;
	String detail;

	public Product() { // constructor
		System.out.println("Ben �al��t�m");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();// bo� constructoru �a��r�yor - 5.sat�rdaki
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}
