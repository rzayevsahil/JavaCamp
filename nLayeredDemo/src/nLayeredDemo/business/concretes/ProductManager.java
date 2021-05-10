package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	// Dependency Injection - sayesinde gevþek baðýmlýlýk yapýyoruz
	// yani sen sadece DataAccess'e gevþek baðýmlýsýn - diyoruz
	// DataAccess'in sadece referans tutucu olan abstract klasöründeki yapýsýna
	// baðlana bilirsin
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
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}

		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi " + product.getName());

		// --- burda biz direk olarak Hibernate'e baðlý oluyor ve böylece alternatif bir
		// sistemi buraya enjekte edemeyiz
		// ---bu yüzden üst kýsýmda Dependency Injection yapýyoruz
		// HibernateProductDao dao = new HibernateProductDao();
		// dao.add(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
