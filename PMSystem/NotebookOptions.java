package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class NotebookOptions implements ProductOptionsContainer {

	@Override
	public int productOptions(ArrayList<Brand> brands) {
		System.out.println("Notebook Options");
		System.out.println("------------------------------");
		System.out.println("1-Show Notebooks");
		System.out.println("2-Add Notebook");
		System.out.println("3-Remove Notebook");
		System.out.println("4-Exit");
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
					showProduct(brands);
					break;
				case 2:
					addProduct(brands);
					break;
				case 3:
					removeProductByID(brands);
					break;
				case 4:
					return 1;
				default:
					System.out.println("enter a valid value");
					
					break;
				}
			
			}while(!(option_input>=1 && option_input<=4));
		return 0;
	}

	@Override
	public void removeProductByID(ArrayList<Brand> brands) {
		int checker=0;
		System.out.println("Enter id of the notebook you want to remove");
		System.out.println("q to stop");
		Scanner input = new Scanner(System.in);
		int option_input = 0;
		do {
				if(!input.hasNextInt())
				{
					System.out.println("enter valid values");
					if(input.nextLine().equalsIgnoreCase("q"))
						break;
					continue;
				}
				option_input=input.nextInt();
				input.nextLine();
				//we iterate over every element of phones from every brand class and compare 
				//id input
				for(Brand i : brands) {
					for(int j=0;j<i.getNotebooks().size();j++) {
						if(i.getNotebooks().get(j).getId()==option_input)
						{
							i.getNotebooks().remove(j);
							System.out.println("removed successfully");
							checker++;
						}
							
					}
					
				}
				if(checker==0) {
					System.out.println("couldnt find item");
				}
				break;
			
			}while(true);
		
		
	}

	@Override
	public void addProduct(ArrayList<Brand> brands) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values with each separated by two white spaces");
		System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s","NAMES","PRICE","BRAND","STORAGE","SCREENSIZE","RAM","STOCK");
		System.out.println("q to stop");
		while(input.hasNextLine()) {

			String pcontainer = input.nextLine();
			String[] psplitter = pcontainer.split("  ");
			if(pcontainer.equals("q"))
				break;

		try {
				for(int i = 0;i<brands.size();i++) {
					if(brands.get(i).getName().equals(psplitter[2])) {
						brands.get(i).getNotebooks().add(new Notebook( psplitter[0]
										, Double.parseDouble(psplitter[1])
										, psplitter[2]
										, Integer.parseInt(psplitter[3])
										, Double.parseDouble(psplitter[4])
										, Integer.parseInt(psplitter[5])
										, Integer.parseInt(psplitter[6])));
						System.out.println("successfull");
					}
				}
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Please enter in correct format!");
				continue;
			}

		}
		
	}

	@Override
	public void showProduct(ArrayList<Brand> brands) {
		int filtercheck=0;
		int option=0;
		Scanner input = new Scanner(System.in);
		System.out.println("1-Filter brand");
		System.out.println("2-Exit");
		System.out.format("%-3s%-25s%-10s%-10s%-8s%-11s%-4s%-8s","ID","NAMES","PRICE","BRAND","STORAGE","SCREENSIZE","RAM","STOCK");
		System.out.println();
		for(Brand i : brands) {
			for(Notebook j : i.getNotebooks()) {
				System.out.format("%-3d%-25s%-10.2f%-10s%-8d%-11.2f%-4d%-8d",j.getId(),j.getName(),j.getPrice(),j.getBrandname(),j.getStorage(),j.getScreenSize(),j.getRam(),j.getStock());
				System.out.println();
			}
		}
		try {
			 option = input.nextInt();
			 //reset
		} catch (Exception e) {
			System.out.println("invalid entry");
		}
		if(option==1) {
			while(input.hasNextLine()) {
				System.out.println("type the brand you want to filter");
				System.out.println("q to exit");
				System.out.println();
				//reset input from last int value
				input.nextLine();
				String brandinput=input.nextLine();
				if(brandinput.equalsIgnoreCase("q")){
					break;
				}
				for(Brand i : brands) {
					if (i.getName().equals(brandinput)) {
						System.out.format("%-3s%-25s%-10s%-10s%-8s%-11s%-4s%-8s","ID","NAMES","PRICE","BRAND","STORAGE","SCREENSIZE","RAM","STOCK");
						System.out.println();
						filtercheck++;
						for(Notebook j : i.getNotebooks()) {
							System.out.format("%-3d%-25s%-10.2f%-10s%-8d%-11.2f%-4d%-8d",j.getId(),j.getName(),j.getPrice(),j.getBrandname(),j.getStorage(),j.getScreenSize(),j.getRam(),j.getStock());
						}
						
					}
					
				}
				if(filtercheck==0)
					System.out.println("couldnt find the brand");
			}
		}
		
	}

}
