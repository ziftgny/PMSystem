package project1;
import java.util.*;
public class PMSystem {
		public int start() {
			ArrayList<Brand> brands = new ArrayList<>();
			//default products
			BrandOptions.addBrand(brands);
			brands.get(5).getPhones().add(new Phone("Lenovo K12 Pro", 249.99, "Lenovo",  64, 6.5, 5000, 4, "Blue",33));
			brands.get(0).getPhones().add(new Phone("iPhone 13 Pro", 999.99, "Apple",  256, 6.1, 3095, 6, "Graphite",2));
			brands.get(4).getPhones().add(new Phone("Huawei P40", 599.99, "Huawei",  128, 6.1, 3800, 8, "Silver",21));
			brands.get(7).getPhones().add(new Phone("Samsung Galaxy S21", 799.99, "Samsung",  128, 6.2, 4000, 8, "Black",31));
			brands.get(6).getPhones().add(new Phone("Monster M12", 199.99, "Monster",  64, 6.5, 4500, 4, "Red",42));
			brands.get(7).getNotebooks().add(new Notebook("Samsung Notebook 1", 999.99, "Samsung", 256, 15.6, 16,2));
			brands.get(5).getNotebooks().add(new Notebook("Lenovo Notebook 1", 849.99, "Lenovo",512, 14.0, 8,31));
			brands.get(0).getNotebooks().add(new Notebook("Apple MacBook Air", 1199.99, "Apple",256, 13.3, 8,42));
			brands.get(4).getNotebooks().add(new Notebook("Huawei MateBook X", 899.99, "Huawei" ,512, 13.0, 16,22));
			brands.get(6).getNotebooks().add(new Notebook("Monster Notebook 1", 1299.99, "Monster", 1000, 15.6, 32,1));

			while(true) {
				
				System.out.println("Choose option");
				System.out.println("------------------------------");
				System.out.println("1-Show brands");
				System.out.println("2-Product options");
				System.out.println("3-Exit");
				Scanner input = new Scanner(System.in);
				int option_input = 0;
				do {
						if(!input.hasNextInt())
						{
							System.out.println("enter valid values");
							input.nextLine();
							continue;
						}
						option_input=input.nextInt();
						input.nextLine();
						switch(option_input) {
						case 1:
							BrandOptions.showBrands(brands);
							break;
						case 2:
							ProductOptions.start(brands);
							break;
						case 3:
							
						return 1;
						default:
							System.out.println("enter a valid value");
							
							break;
						}
					
					}while(!(option_input>=1 && option_input<=3));
				
			}
			

		}
		
		
		
}
