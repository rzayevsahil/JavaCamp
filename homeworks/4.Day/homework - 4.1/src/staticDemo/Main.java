package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "";
		
		manager.add(product);
		
		
		// --- class i�inde class (ana class ve inner class)
		// --- bu tip yap�lar� best practice i�in iyi bir�ey de�il
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();

	}

}
