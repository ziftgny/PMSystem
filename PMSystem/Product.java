package project1;

import java.util.ArrayList;

public abstract class Product {
	private static int autoid=0;
	protected int id;
	private String name;
	private double price;
	protected String brandname;
	private int stock;
	public Product(String name, double price, String brandname, int stock) {
		super();
		autoid++;
		this.name = name;
		this.price = price;
		this.brandname = brandname;
		this.stock = stock;
		this.id=autoid;
	}
	public static int getAutoid() {
		return autoid;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getBrandname() {
		return brandname;
	}
	public int getStock() {
		return stock;
	}
	
	
	
	
	
	
	
}
