package project1;

import java.util.ArrayList;

public class Phone extends Product {
	private int storage;
	private double screensize;
	private int batterypower;
	private int ram;
	private String color;
	public Phone( String name, double price, String brandname, int storage, double screensize,
			int batterypower, int ram, String color,int stock) {
		super(name, price, brandname, stock);
		this.storage = storage;
		this.screensize = screensize;
		this.batterypower = batterypower;
		this.ram = ram;
		this.color = color;
	}
	public int getStorage() {
		return storage;
	}
	public double getScreensize() {
		return screensize;
	}
	public int getBatterypower() {
		return batterypower;
	}
	public int getRam() {
		return ram;
	}
	public String getColor() {
		return color;
	}

	
	


		
}
