
package com.spring.main;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidProductIdException;
import com.spring.model.Product;
import com.spring.service.ProductService;

@Component
public class Driver {
 	public static void main(String[] args) {
 		// fill the code
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id:");
		String productId= sc.nextLine();
		System.out.println("Enter the product name:");
		String productName=sc.nextLine();
		System.out.println("Enter the mrp value:");
		double mrp= sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the dimension details:");
		String dimension= sc.nextLine();
		System.out.println("Enter the wood type:");
		String woodType= sc.nextLine();
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ProductService product=(ProductService)context.getBean(ProductService.class);
		try {
			double d =product.calculateBill(productId, productName, mrp, dimension, woodType);
			System.out.println("Amount to be paid is :"+d);
		} catch (InvalidProductIdException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
