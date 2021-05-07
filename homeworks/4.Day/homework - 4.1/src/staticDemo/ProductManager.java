package staticDemo;

import javax.xml.validation.Validator;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator=new ProductValidator();
		if(ProductValidator.isValid(product)) { //isValid static diye new'lemiyoruz
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}		
		
		ProductValidator productValidator=new ProductValidator();
		productValidator.bisey();//bisey static deðil diye new'liyoruz
		//burda yapýcý blok yani constructor çalýþýr çünki burda new'liyoruz
		
		
	}
	
	
	
}
