package oopIntro;

public class Product {

	public Product() { // constructor
		System.out.println("Ben �al��t�m");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();//bo� consturctoru �a��r�yor - 5.sat�rdaki
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
