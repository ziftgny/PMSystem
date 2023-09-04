package project1;

import java.util.ArrayList;

public class Brand {
		private static int autoid=0;
		private int id;
		private String name;
		private ArrayList<Phone> phones=new ArrayList<>();
		private ArrayList<Notebook> notebooks=new ArrayList<>();
		public Brand(String name) {
			super();
			autoid++;
			this.id = autoid;
			this.name = name;
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
		public ArrayList<Phone> getPhones() {
			return phones;
		}
		public ArrayList<Notebook> getNotebooks() {
			return notebooks;
		}
		
		
		
		
		

}
