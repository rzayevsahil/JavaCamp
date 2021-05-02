package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram");// �rnek olu�turma, referans olu�turma, instance
		

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.name);
		}

		System.out.println(products.length);
		
		
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Ev/Bah�e";

	}

}
