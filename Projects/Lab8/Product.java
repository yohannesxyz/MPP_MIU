package Lab8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Product {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}

	public List<Product> sortByPrice(List<Product> productList) {
		Collections.sort(productList,(x, y)->{if((int)(x.getPrice() - y.getPrice())==0){
		return x.getModel()-(y.getModel());
		}else{
			return (int)(x.getPrice() - y.getPrice());
		}
		});
		return productList;

	}



}
