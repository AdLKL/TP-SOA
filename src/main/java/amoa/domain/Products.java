package amoa.domain;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
	
	@XmlElement(name = "product")
	private List<Product> products;

	public Products() {
		
	}
	public Products(List<Product> products) {
		super();
		this.products = products;
	}
	
	public long add(Product product) {
		return 0;
	}
	
	public Product get(long id) {
		for(Product product : products) {
			if(id == product.getId()) {
				return product;
			}
		}
		return null;
	}
	
	public boolean remove(long id) {
		return false;
	}
	
	public boolean removeAll() {
		return false;
	}
	
	

}
