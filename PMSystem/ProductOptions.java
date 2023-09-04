package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductOptions {
	public static int start(ArrayList<Brand> brands) {
		System.out.println("Product Options");
		System.out.println("------------------------------");
		System.out.println("1-Phone Options");
		System.out.println("2-Notebook Options");
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
					PhoneOptions p = new PhoneOptions();
					p.productOptions(brands);
					break;
				case 2:	
					NotebookOptions n = new NotebookOptions();
					n.productOptions(brands);
					break;
				case 3:
					return 1;
				default:
					System.out.println("enter a valid value");
					
					break;
				}
			
			}while(!(option_input>=1 && option_input<=3));
		return 0;
	}
}


