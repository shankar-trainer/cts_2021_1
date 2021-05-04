
package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.bo.ProductBO;
import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidProductIdException;
import org.springframework.stereotype.Component;
import com.spring.model.Product;

@Component
public class ProductService {

	private ProductBO productBOObj;

	@Autowired
	public ProductService(ProductBO productBOObj) {
		super();
		this.productBOObj = productBOObj;
	}

	public ProductBO getProductBOObj() {
		return productBOObj;
	}

	public void setProductBOObj(ProductBO productBOObj) {
		this.productBOObj = productBOObj;
	}

	public double calculateBill(String productId, String productName, double mrpValue, String dimension,
			String woodType) throws InvalidProductIdException {
		double amount = 0;
		// fill the code
		if (productId.matches("[0-9]+")) {
			ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
			Product product = (Product) context.getBean(Product.class);
			product.setDimension(dimension);
			product.setMrpValue(mrpValue);
			product.setProductId(productId);
			product.setProductName(productName);
			amount = productBOObj.calculateBill(product, woodType);
		} else {
			throw new InvalidProductIdException("Invalid Product ID");
		}
		return amount;
	}
}
