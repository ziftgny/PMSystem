package project1;

public class Notebook extends Product {
	private int storage;
	private double screenSize;
	private int ram;
	public Notebook(String name, double price, String brandname,int storage,double screenSize,int ram,int stock) {
		super(name, price, brandname, stock);
		this.screenSize=screenSize;
		this.ram=ram;
		this.storage=storage;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public int getRam() {
		return ram;
	}
	public int getStorage() {
		return storage;
	}
	

}
