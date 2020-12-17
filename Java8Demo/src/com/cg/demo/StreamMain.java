package com.cg.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamMain {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 40000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productPriceList = productsList.stream().filter(p->p.price>30000).map(p->p.price)
				.collect(Collectors.toList());
		System.out.println("Price List:"+productPriceList);
		
		System.out.println("Product Name acc to price: ");
		productsList.stream().filter(p->p.price>30000).forEach(p->System.out.println(p.name));
		
		System.out.println("Iterator:");
		Stream.iterate(1, seed->seed+1).filter(seed->seed%5==0).limit(2).forEach(System.out::println);
		
		float totalPrice=productsList.stream().map(p->p.price).reduce(0.0f, Float::sum);
		System.out.println("Total price:"+totalPrice);
		System.out.println("Count: "+productsList.stream().count());
		System.out.println("Conditional Count: "+productsList.stream().filter(p->p.price<30000).count());
	}
}
