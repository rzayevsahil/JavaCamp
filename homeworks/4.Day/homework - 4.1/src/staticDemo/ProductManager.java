package staticDemo;

import javax.xml.validation.Validator;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator=new ProductValidator();
		if(ProductValidator.isValid(product)) { //isValid static diye new'lemiyoruz
			System.out.println("Eklendi.");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}		
		
		ProductValidator productValidator=new ProductValidator();
		productValidator.bisey();//bisey static de�il diye new'liyoruz
		//burda yap�c� blok yani constructor �al���r ��nki burda new'liyoruz
		
		
	}
	
	
	
}
