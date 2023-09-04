package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BrandOptions {
	
	
		public static void addBrand(ArrayList<Brand> brands) {
			brands.add(new Brand("Samsung"));
			brands.add(new Brand("Lenovo"));
			brands.add(new Brand("Apple"));
			brands.add(new Brand("Huawei"));
			brands.add(new Brand("Casper"));
			brands.add(new Brand("Asus"));
			brands.add(new Brand("HP"));
			brands.add(new Brand("Xiaomi"));
			brands.add(new Brand("Monster"));
			Collections.sort(brands,new Comparator<>() {
				
				public int compare(Brand o1, Brand o2) {
					
					return o1.getName().compareTo(o2.getName());
				}
			});
		}
		public static void showBrands(ArrayList<Brand> brands) {
			System.out.println("Brands");
			System.out.println("------------------------------");
			for(Brand i : brands) {
				System.out.println(i.getName());
			}
			System.out.println();
		}
}
