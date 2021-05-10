package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	// Dependency Injection - sayesinde gev�ek ba��ml�l�k yap�yoruz
	// yani sen sadece DataAccess'e gev�ek ba��ml�s�n - diyoruz
	// DataAccess'in sadece referans tutucu olan abstract klas�r�ndeki yap�s�na
	// ba�lana bilirsin
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
		}

		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi " + product.getName());

		// --- burda biz direk olarak Hibernate'e ba�l� oluyor ve b�ylece alternatif bir
		// sistemi buraya enjekte edemeyiz
		// ---bu y�zden �st k�s�mda Dependency Injection yap�yoruz
		// HibernateProductDao dao = new HibernateProductDao();
		// dao.add(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
