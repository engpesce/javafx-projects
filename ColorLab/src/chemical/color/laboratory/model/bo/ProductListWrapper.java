package chemical.color.laboratory.model.bo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of products. This is used for saving the
 * list of products to XML.
 * 
 */
@XmlRootElement(name = "products")
public class ProductListWrapper {

	private List<Product> products;

	@XmlElement(name = "products")
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
