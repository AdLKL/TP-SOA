package amoa.webservices;

import java.util.ArrayList;

import amoa.domain.Product;
import amoa.domain.Products;
import amoa.exceptions.NoSuchProductException;
import jakarta.jws.WebService;

@WebService(endpointInterface = "amoa.webservices.ProductsManager")
public class ProductsManagerImpl implements ProductsManager{
	
	private static Products products = new Products(new ArrayList<>());

	@Override
	public long addProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product getProduct(long id) throws NoSuchProductException {
		Product product = products.get(id);
		if(product != null) {
			return product;
		} else {
			throw new NoSuchProductException("No such Product");
		}
	}

	@Override
	public double getProductPrice(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Products getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAllProducts() {
		// TODO Auto-generated method stub
		return false;
	}

}
