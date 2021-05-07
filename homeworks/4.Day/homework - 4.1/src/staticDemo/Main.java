package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "";
		
		manager.add(product);
		
		
		// --- class içinde class (ana class ve inner class)
		// --- bu tip yapýlarý best practice için iyi birþey deðil
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();

	}

}
