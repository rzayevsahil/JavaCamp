package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;



@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	
	@Autowired//newleme işlemi yapıyor kısaca
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Product>getAll(){
		return this.productService.getAll();
	}
	
}


//kodlama.io/api/products